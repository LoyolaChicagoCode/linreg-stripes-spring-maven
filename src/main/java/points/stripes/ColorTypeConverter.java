package points.stripes;

import java.awt.Color;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import net.sourceforge.stripes.validation.TypeConverter;
import net.sourceforge.stripes.validation.ValidationError;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.log4j.Logger;

public class ColorTypeConverter implements TypeConverter<Color> {

	private final static Logger LOGGER = Logger.getLogger(ColorTypeConverter.class);

	@Override
	public Color convert(final String input, Class<? extends Color> clazz, final Collection<ValidationError> errors) {
		LOGGER.debug("conversion of color " + input);
		if ("red".equals(input))
			return Color.RED;
		if ("green".equals(input))
			return Color.GREEN;
		if ("blue".equals(input))
			return Color.BLUE;
		throw new IllegalArgumentException("unknown color string");
	}

	@Override
	public void setLocale(final Locale locale) { }

	public static String asString(Color c) {
		if (Color.RED.equals(c))
			return "red";
		if (Color.GREEN.equals(c))
			return "green";
		if (Color.BLUE.equals(c))
			return "blue";
		throw new IllegalArgumentException("unknown color value");
	}

	@SuppressWarnings("unchecked")
	public static List<String> asStrings(Collection<Color> colors) {
		return (List<String>) CollectionUtils.collect(colors,
				new Transformer() {
					public Object transform(Object input) {
						return asString((Color) input);
					}
				});
	}
}
