package hu.blackbelt.judo.meta.jql.runtime;

import com.google.inject.Singleton;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.IDValueConverter;
import org.eclipse.xtext.nodemodel.INode;

@Singleton
public class JqlTerminalConverters extends DefaultTerminalConverters {

    @ValueConverter(rule = "ID")
    public IValueConverter<String> getIdTerminalConverter() {
        return new IDValueConverter() {

            @Override
            public String toValue(String string, INode node) {
                if (string == null)
                    return null;
                return string.startsWith("\\") ? string.substring(1) : string;
            }

            protected String toEscapedString(String value) {
                if (mustEscape(value))
                    return "\\" + value;
                return value;
            }
        };

    }

    @ValueConverter(rule = "DATE")
    public IValueConverter<String> getDateTerminalConverter() {
        return new IValueConverter<String>() {

            @Override
            public String toString(String value) throws ValueConverterException {
                return String.format("`%s`", value);
            }

            @Override
            public String toValue(String string, INode node) throws ValueConverterException {
                return string.substring(1, string.length() - 1);
            }

        };
    }

    @ValueConverter(rule = "TIMESTAMP")
    public IValueConverter<String> getTimeStampTerminalConverter() {
        return new IValueConverter<String>() {

            @Override
            public String toString(String value) throws ValueConverterException {
                return String.format("`%s`", value);
            }

            @Override
            public String toValue(String string, INode node) throws ValueConverterException {
                return string.substring(1, string.length() - 1);
            }

        };
    }

}
