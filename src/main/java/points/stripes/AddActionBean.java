package points.stripes;

import net.sourceforge.stripes.action.Resolution;
import points.domain.Point;

/**
 * An action bean for a regression service.
 */
public class AddActionBean extends PointActionBean {

	public Resolution add() {
		setColors();
		return Constants.VIEW_ADD;
	}

	public Resolution addSubmit() {
		final Point p = getPoint();
		getRegressionService().addPoint(p.getX(), p.getY(), p.getColor());
		setMessageKey("add.message");
		return Constants.EVENT_LIST;
	}
}
