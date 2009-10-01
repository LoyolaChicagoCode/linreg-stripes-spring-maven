package points.stripes;

import java.util.List;

import net.sourceforge.stripes.validation.Validate;
import net.sourceforge.stripes.validation.ValidateNestedProperties;
import points.domain.impl.DefaultPoint;

/**
 * An action bean for a regression service.
 */
public abstract class PointActionBean extends RegressionServiceActionBean {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		System.out.println("setId to " + id);
		this.id = id;
	}

	private List<String> colors;

	public List<String> getColors() {
		return colors;
	}

	protected void setColors(final List<String> colors) {
		this.colors = colors;
	}

	protected void setColors() {
		setColors(ColorTypeConverter.asStrings(getRegressionService()
				.getColors()));
	}

	@ValidateNestedProperties( {
			@Validate(field = "x", required = true, on = { "addSubmit", "editSubmit" }),
			@Validate(field = "y", required = true, on = { "addSubmit",	"editSubmit" }),
			@Validate(field = "color", required = true, on = { "addSubmit",	"editSubmit" }) })
	private DefaultPoint point;

	public DefaultPoint getPoint() {
		return point;
	}

	public void setPoint(final DefaultPoint point) {
		this.point = point;
		// make sure colors are available if there are errors
		setColors();
		System.out.println("setPoint to " + getPoint());
	}

	public String getColor() {
		return ColorTypeConverter.asString(getPoint().getColor());
	}

	protected void setMessageKey(final String messageKey) {
		getContext().getRequest().setAttribute(Constants.ATTRIBUTE_MESSAGE_KEY,
				messageKey);
	}
}
