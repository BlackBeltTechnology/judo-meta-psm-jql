package hu.blackbelt.judo.meta.jql.runtime

import hu.blackbelt.judo.meta.jql.jqldsl.BinaryOperation
import hu.blackbelt.judo.meta.jql.jqldsl.BooleanLiteral
import hu.blackbelt.judo.meta.jql.jqldsl.DateLiteral
import hu.blackbelt.judo.meta.jql.jqldsl.DecimalLiteral
import hu.blackbelt.judo.meta.jql.jqldsl.EnumLiteral
import hu.blackbelt.judo.meta.jql.jqldsl.Expression
import hu.blackbelt.judo.meta.jql.jqldsl.IntegerLiteral
import hu.blackbelt.judo.meta.jql.jqldsl.LambdaExpression
import hu.blackbelt.judo.meta.jql.jqldsl.MeasuredLiteral
import hu.blackbelt.judo.meta.jql.jqldsl.NavigationExpression
import hu.blackbelt.judo.meta.jql.jqldsl.StringLiteral
import hu.blackbelt.judo.meta.jql.jqldsl.SwitchConditionalCase
import hu.blackbelt.judo.meta.jql.jqldsl.SwitchConditionalExpression
import hu.blackbelt.judo.meta.jql.jqldsl.SwitchEqualsCase
import hu.blackbelt.judo.meta.jql.jqldsl.SwitchEqualsExpression
import hu.blackbelt.judo.meta.jql.jqldsl.SwitchExpression
import hu.blackbelt.judo.meta.jql.jqldsl.TimeStampLiteral
import hu.blackbelt.judo.meta.jql.jqldsl.UnaryOperation
import java.math.BigDecimal
import java.math.BigInteger
import org.junit.jupiter.api.Test

import static extension org.junit.jupiter.api.Assertions.*

class JqlDslGrammarTest {

    JqlParser parser = new JqlParser

    @Test
    def void stringLiterals() {
        var string = "'hello'".parse
        "hello".assertEquals(string.expressionValue)

        string = '''
            "hello"
        '''.parse
        "hello".assertEquals(string.expressionValue)
    }

    @Test
    def void booleanLiterals() {
        var literal = "true".parse as BooleanLiteral
        assertTrue(literal.isIsTrue)
        literal = "false".parse as BooleanLiteral
        assertFalse(literal.isIsTrue)
    }

    @Test
    def void numericLiterals() {
        var integer = parser.parseString("123") as IntegerLiteral
        BigInteger.valueOf(123).assertEquals(integer.expressionValue)

        integer = parser.parseString("123456789012345678901234567890") as IntegerLiteral
        new BigInteger("123456789012345678901234567890").assertEquals(integer.expressionValue)

        var decimal = parser.parseString("123.0") as DecimalLiteral
        new BigDecimal("123.0").assertEquals(decimal.expressionValue)
    }

    @Test
    def void arithmeticOperations() {
        var operation = "a/b".parse as BinaryOperation
        "/".assertEquals(operation.operator)

        operation = "a div b".parse as BinaryOperation
        "div".assertEquals(operation.operator)

        operation = "a mod b".parse as BinaryOperation
        "mod".assertEquals(operation.operator)

        operation = "a % b".parse as BinaryOperation
        "%".assertEquals(operation.operator)

        operation = "a * b".parse as BinaryOperation
        "*".assertEquals(operation.operator)

        operation = "a + b".parse as BinaryOperation
        "+".assertEquals(operation.operator)

        operation = "a - b".parse as BinaryOperation
        "-".assertEquals(operation.operator)
    }

    @Test
    def void unaryExpressions() {
        var exp = parser.parseString("-100") as UnaryOperation
        "-".assertEquals(exp.operator)
        BigInteger.valueOf(100).assertEquals(exp.operand.expressionValue)

        exp = parser.parseString("!false") as UnaryOperation
        "!".assertEquals(exp.operator)
        false.assertEquals(exp.operand.expressionValue)

        exp = parser.parseString("not true") as UnaryOperation
        "not".assertEquals(exp.operator)
        true.assertEquals(exp.operand.expressionValue)
    }

    @Test
    def void temporalLiterals() {
        var date = parser.parseString("{2001-09-12} ")
        "2001-09-12".assertEquals(date.expressionValue)

        val parsedTimeStamp = parser.parseString("{2001-09-12T12:00:00-05:00 Europe/Budapest} ")
        var timeStamp = parsedTimeStamp as TimeStampLiteral
        "2001-09-12T12:00:00-05:00 Europe/Budapest".assertEquals(timeStamp.value)
    }

    @Test
    def void measuredNumericLiterals() {
        var exp = parser.parseString("10[kg]") as MeasuredLiteral
        BigInteger.valueOf(10).assertEquals(exp.expressionValue)
        "kg".assertEquals(exp.measure)

        exp = parser.parseString("0.1[Mass::mg]") as MeasuredLiteral
        BigDecimal.valueOf(0.1).assertEquals(exp.expressionValue)
        "Mass::mg".assertEquals(exp.measure)
    }

    @Test
    def void navigation() {
        var exp = parser.parseString("a.b.c") as NavigationExpression
        "a".assertEquals(exp.base)
        var features = exp.features
        2.assertEquals(features.size)
        "b".equals(features.get(0).name)
        "c".equals(features.get(1).name)
    }

    @Test
    def void relationalOperations() {
        var exp = parser.parseString("a <= 10") as BinaryOperation
        "<=".assertEquals(exp.operator)
        BigInteger.valueOf(10).assertEquals(exp.rightOperand.expressionValue)
        assertTrue(exp.leftOperand instanceof NavigationExpression)
    }

    @Test
    def void parenthesizedOperations() {
        var exp = "self.quantity * self.unitPrice * (1 - self.discount)".parse as BinaryOperation
        "*".assertEquals(exp.operator)
        var left = exp.leftOperand as BinaryOperation
        "self".assertEquals((left.leftOperand as NavigationExpression).base)
        "quantity".assertEquals((left.leftOperand as NavigationExpression).features.get(0).name)
        var right = exp.rightOperand as BinaryOperation
        "-".assertEquals(right.operator)
        BigInteger.valueOf(1).assertEquals(right.leftOperand.expressionValue)
        "discount".assertEquals((right.rightOperand as NavigationExpression).features.get(0).name)

        exp = "self.quantity * self.unitPrice + self.unitDiscount * self.quantity".parse as BinaryOperation
        "+".assertEquals(exp.operator)
        "*".assertEquals((exp.leftOperand as BinaryOperation).operator)
        "*".assertEquals((exp.rightOperand as BinaryOperation).operator)
    }

    @Test
    def void caseCondition() {
        var switchExp = "CASE self.quantity AS q WHEN q < 10 THEN false WHEN q > 20 THEN self.defaultValue ELSE true".
            parse as SwitchExpression
        var exp = switchExp.body as SwitchConditionalExpression
        "q".assertEquals(exp.alias.name)
        true.assertEquals(exp.^default.expressionValue)
        val case1 = exp.cases.get(0) as SwitchConditionalCase
        false.assertEquals(case1.result.expressionValue)
        val case1Condition = case1.condition as BinaryOperation
        "q".assertEquals((case1Condition.leftOperand as NavigationExpression).base)
        "<".assertEquals(case1Condition.operator)
        BigInteger.valueOf(10).assertEquals(case1Condition.rightOperand.expressionValue)
        val case2 = exp.cases.get(1) as SwitchConditionalCase
        "self".assertEquals((case2.result as NavigationExpression).base)
    }

    @Test
    def void caseEquality() {
        var integerCase = "(CASE self.quantity WHEN 10 THEN false ELSE true)".parse as SwitchExpression
        BigInteger.valueOf(10).assertEquals(
            ((integerCase.body as SwitchEqualsExpression).cases.get(0) as SwitchEqualsCase).condition.expressionValue)

        var transformedSwitch = "CASE self.product.name!toUpperCase WHEN 'HAMBURGER' THEN 0 WHEN 'HOTDOG' THEN 1 ELSE -1".
            parse as SwitchExpression
        "HOTDOG".assertEquals(
            ((transformedSwitch.body as SwitchEqualsExpression).cases.get(1) as SwitchEqualsCase).condition.
                expressionValue)

        val enumCase = "CASE self.orderDay WHEN `MONDAY THEN 0 WHEN `TUESDAY THEN 1 ELSE -1".parse as SwitchExpression
        var exp = enumCase.body as SwitchEqualsExpression
        val case1 = exp.cases.get(0) as SwitchEqualsCase
        "MONDAY".assertEquals(case1.condition.expressionValue)

    }

    @Test
    def void functions() {
        val stringExp = "('hello')!toUpperCase".parse as StringLiteral
        "toUpperCase".assertEquals(stringExp.functions.get(0).feature.name)
        val navigationExp = "self.description!length".parse as NavigationExpression
        "length".assertEquals(navigationExp.functions.get(0).feature.name)
        val sumExp = "('hello'!length + 'world'!length)".parse as BinaryOperation
        "length".assertEquals((sumExp.leftOperand as StringLiteral).functions.get(0).feature.name)

        val concatExp = "self.description!concatenate(self.copyright)".parse
        "copyright".assertEquals(
            (concatExp.functions.get(0).parameters.get(0) as NavigationExpression).features.get(0).name)

        val unaryExp = "-123.0!round!radix(16)".parse as UnaryOperation
        "-".assertEquals(unaryExp.operator)
        "round".assertEquals(unaryExp.functions.get(0).feature.name)
        "radix".assertEquals(unaryExp.functions.get(1).feature.name)
        BigInteger.valueOf(16).assertEquals(unaryExp.functions.get(1).parameters.get(0).expressionValue)
    }

    @Test
    def void functionsLambda() {
        val filterExp = "
            // multiline expression
            self.od!
                filter(
                    od | od.price > 10
                )
        ".parse as NavigationExpression
        "filter".assertEquals(filterExp.functions.get(0).feature.name)
        val filterLambda = filterExp.functions.get(0).lambda as LambdaExpression
        "od".assertEquals(filterLambda.argument.name)
        val filterLambdaStatement = filterLambda.statement as BinaryOperation
        ">".assertEquals(filterLambdaStatement.operator)
        BigInteger.valueOf(10).assertEquals(filterLambdaStatement.rightOperand.expressionValue)
        "od".assertEquals((filterLambdaStatement.leftOperand as NavigationExpression).base)
        "price".assertEquals((filterLambdaStatement.leftOperand as NavigationExpression).features.get(0).name)
    }

    @Test
    def void cast() {
        val exp = "self.od@String!toUpperCase".parse as NavigationExpression
        "self".assertEquals(exp.base)
        "String".assertEquals(exp.cast)

        val fqExp = "self.od@Lib::Custom!filter(e | e < 10)".parse as NavigationExpression
        "self".assertEquals(fqExp.base)
        "Lib::Custom".assertEquals(fqExp.cast)
        val fqLambda = fqExp.functions.get(0).lambda as LambdaExpression
        "e".assertEquals(fqLambda.argument.name)
    }

    @Test
    def void typeFunctions() {
        val exp = "self.field!instanceof(Lib::MyType)".parse as NavigationExpression
        "Lib::MyType".assertEquals((exp.functions.get(0).parameters.get(0) as NavigationExpression).base)

    }

    @Test
    def void enumLiteral() {
        var exp = "`MONDAY".parse as EnumLiteral
        "MONDAY".assertEquals(exp.value)
        exp = "`Days::MONDAY".parse as EnumLiteral
        "Days::MONDAY".assertEquals(exp.value)
    }

    def Expression parse(CharSequence expressionText) {
        return parser.parseString(expressionText.toString);
    }

    def Object expressionValue(Expression exp) {
        switch exp {
            StringLiteral: exp.value
            IntegerLiteral: exp.value
            DecimalLiteral: exp.value
            DateLiteral: exp.value
            TimeStampLiteral: exp.value
            BooleanLiteral: exp.isIsTrue
            MeasuredLiteral: exp.value.expressionValue
            EnumLiteral: exp.value
            default: null
        }
    }

}
