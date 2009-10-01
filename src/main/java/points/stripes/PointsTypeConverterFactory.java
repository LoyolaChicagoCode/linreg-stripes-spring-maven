package points.stripes;

import java.awt.Color;

import net.sourceforge.stripes.validation.DefaultTypeConverterFactory;

public class PointsTypeConverterFactory extends DefaultTypeConverterFactory {

	{
		add(Color.class, ColorTypeConverter.class);
	}

}
