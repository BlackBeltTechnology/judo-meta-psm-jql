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
import hu.blackbelt.judo.meta.jql.jqldsl.TernaryOperation
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

        operation = "a DIV b".parse as BinaryOperation
        "DIV".assertEquals(operation.operator)

        operation = "a mod b".parse as BinaryOperation
        "mod".assertEquals(operation.operator)

        operation = "a * b".parse as BinaryOperation
        "*".assertEquals(operation.operator)

        operation = "a + b".parse as BinaryOperation
        "+".assertEquals(operation.operator)

        operation = "'a' + \"b\"".parse as BinaryOperation
        "+".assertEquals(operation.operator)

        operation = "a - b".parse as BinaryOperation
        "-".assertEquals(operation.operator)
    }

    @Test
    def void unaryExpressions() {
        var exp = parser.parseString("-100") as UnaryOperation
        "-".assertEquals(exp.operator)
        BigInteger.valueOf(100).assertEquals(exp.operand.expressionValue)

        exp = parser.parseString("not true") as UnaryOperation
        "not".assertEquals(exp.operator)
        true.assertEquals(exp.operand.expressionValue)

        exp = parser.parseString("Not True") as UnaryOperation
        "Not".assertEquals(exp.operator)
        true.assertEquals(exp.operand.expressionValue)
    }

    @Test
    def void ifElse() {
        val exp = "a ? b : c".parse as TernaryOperation
        "a".assertEquals(exp.condition.asString)
        "b".assertEquals(exp.thenExpression.asString)
        "c".assertEquals(exp.elseExpression.asString)
        "(if a b c)".assertEquals(exp.asString)

        val conditionThen = "a<1 ? b<2 : c>3".parse as TernaryOperation
        "(< a 1)".assertEquals(conditionThen.condition.asString)
        "(if (< a 1) (< b 2) (> c 3))".assertEquals(conditionThen.asString)

        // right-associtivity tests
        val combinedExp = "a ? b : c ? d : e".parse as TernaryOperation
        "(if a b (if c d e))".assertEquals(combinedExp.asString)

        val parenExp = "a ? b : (c ? d : e)".parse as TernaryOperation
        "(if a b (if c d e))".assertEquals(parenExp.asString)

        val hardExpParen = "a ? (b ? c : d) : (e ? (f ? g : h) : (i ? j : (k ? l : m))) ".parse as TernaryOperation
        "(if a (if b c d) (if e (if f g h) (if i j (if k l m))))".assertEquals(hardExpParen.asString)
        val hardExp = "a<0 ? b=q ? c : d : e ? f ? g : h : i ? j : k = q xor r ? l and o or p : m implies n ".
            parse as TernaryOperation
        "(if (< a 0) (if (= b q) c d) (if e (if f g h) (if i j (if (xor (= k q) r) (or (and l o) p) (implies m n)))))".
            assertEquals(hardExp.asString)
    }

    @Test
    def void logicalPrecedence() {
        "(or a (not b))".assertEquals("a or not b".parse.asString)
        "(or a (and b c))".assertEquals("a or b and c".parse.asString)
        "(or (and a b) c)".assertEquals("a and b or c".parse.asString)
        "(or (and a (not b)) (not c))".assertEquals("a and not b or not c".parse.asString)
        "(or (and a (not b)) (not c))".assertEquals("(a and not b) or not c".parse.asString)
        "(and a (not (or b (not c))))".assertEquals("a and not (b or not c)".parse.asString)
        "(and a (or (not b) (not c)))".assertEquals("a and (not b or not c)".parse.asString)

        "(xor a b)".assertEquals("a xor b".parse.asString)
        "(xor a (and b c))".assertEquals("a xor b and c".parse.asString)
        "(xor (and a b) c)".assertEquals("a and b xor c".parse.asString)
        "(or (xor a b) c)".assertEquals("a xor b or c".parse.asString)
        "(or a (xor b c))".assertEquals("a or b xor c".parse.asString)

        "(implies a b)".assertEquals("a implies b".parse.asString)
        "(implies a (xor b c))".assertEquals("a implies b xor c".parse.asString)
        "(implies (or a b) (xor c d))".assertEquals("a or b implies c xor d".parse.asString)

        "(implies a (or b (xor c (and d (not e)))))".assertEquals("a implies b or c xor d and not e".parse.asString)
        "(implies (or (xor (and (not a) b) c) d) e)".assertEquals("not a and b xor c or d implies e".parse.asString)

        "(or (<> a b) (= b c))".assertEquals("a <> b or b = c".parse.asString)
        "(implies (and (<> a b) (= b c)) (or (<= c d) (>= d e)))".assertEquals(
            "a <> b and b = c implies c <= d or d >= e".parse.asString)

        "(= (< a b) (< c d))".assertEquals("a<b=c<d".parse.asString)

        "(and (= a b) c)".assertEquals("a = b and c".parse.asString)
        "(or (= a b) c)".assertEquals("a = b or c".parse.asString)
        "(xor (= a b) c)".assertEquals("a = b xor c".parse.asString)
    }

    def String asString(Expression exp) {
        val result = new StringBuilder();
        if (exp instanceof BinaryOperation) {
            result.append(String.format("(%s ", exp.operator))
            result.append(exp.leftOperand.asString)
            result.append(" ")
            result.append(exp.rightOperand.asString)
            result.append(")")
        } else if (exp instanceof NavigationExpression) {
            result.append(exp.base)
            exp.features.forEach[result.append("." + it.name)]
            exp.functions.forEach [
                result.append(String.format("!%s(", it.feature.name))
                it.parameters.forEach [ parameter, i |
                    result.append(parameter.asString)
                    if (i < parameters.size - 1) {
                        result.append(",")
                    }
                ]
                result.append(")")
            ]
        } else if (exp instanceof UnaryOperation) {
            result.append(String.format("(%s %s)", exp.operator, exp.operand.asString))
        } else if (exp instanceof TernaryOperation) {
            result.append(String.format("(if %s %s %s)", exp.condition.asString, exp.thenExpression.asString,
                exp.elseExpression.asString))
        } else {
            result.append(exp.expressionValue)
        }
        return result.toString
    }

    @Test
    def void temporalLiterals() {
        var date = parser.parseString("`2001-09-12` ")
        "2001-09-12".assertEquals(date.expressionValue)

        val parsedTimeStamp = parser.parseString("`2001-09-12T12:00:00-05:00 Europe/Budapest`")
        var timeStamp = parsedTimeStamp as TimeStampLiteral
        "2001-09-12T12:00:00-05:00 Europe/Budapest".assertEquals(timeStamp.value)
    }

    @Test
    def void measuredNumericLiterals() {
        var exp = parser.parseString("10[kg]") as MeasuredLiteral
        BigInteger.valueOf(10).assertEquals(exp.expressionValue)
        "kg".assertEquals(exp.measure)

        exp = parser.parseString("0.1[model::Mass#mg]") as MeasuredLiteral
        BigDecimal.valueOf(0.1).assertEquals(exp.expressionValue)
        "model::Mass".assertEquals(exp.type)
        "mg".assertEquals(exp.measure)
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
    def void functions() {
        val stringExp = "('hello')!toUpperCase()".parse as StringLiteral
        "toUpperCase".assertEquals(stringExp.functions.get(0).feature.name)
        val navigationExp = "self.description!length()".parse as NavigationExpression
        "length".assertEquals(navigationExp.functions.get(0).feature.name)
        val sumExp = "('hello'!length() + 'world'!length())".parse as BinaryOperation
        "length".assertEquals((sumExp.leftOperand as StringLiteral).functions.get(0).feature.name)

        val concatExp = "self.description!concat(self.copyright, a<12)".parse
        "copyright".assertEquals(
            (concatExp.functions.get(0).parameters.get(0) as NavigationExpression).features.get(0).name)
        "a".assertEquals((concatExp.functions.get(0).parameters.get(1) as BinaryOperation).leftOperand.asString)

        val unaryExp = "-123.0!round()!radix(16)".parse as UnaryOperation
        "-".assertEquals(unaryExp.operator)
        "round".assertEquals(unaryExp.functions.get(0).feature.name)
        "radix".assertEquals(unaryExp.functions.get(1).feature.name)
        BigInteger.valueOf(16).assertEquals(unaryExp.functions.get(1).parameters.get(0).expressionValue)

        val conditionalFunction = "self.text!length() < 10 ? self.text!fun(param1, param2) : model::Text.item > 0 ? true : false".
            parse
        "(if (< self.text!length() 10) self.text!fun(param1,param2) (if (> model::Text.item 0) true false))".
            assertEquals(conditionalFunction.asString)

        try {
            "self.text!length<".parse
            fail("Should have thrown exception on invalid syntax")
        } catch (JqlParseException expected) {
        }

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
        val exp = "self.od@String!toUpperCase()".parse as NavigationExpression
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
        var exp = "#MONDAY".parse as EnumLiteral
        "MONDAY".assertEquals(exp.value)
        exp = "model::Days#MONDAY".parse as EnumLiteral
        "model::Days".assertEquals(exp.type)
        "MONDAY".assertEquals(exp.value)
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
            EnumLiteral: (exp.type === null ? "" : exp.type + "#") + exp.value
            default: null
        }
    }

}
