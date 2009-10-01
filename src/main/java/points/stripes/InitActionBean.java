package points.stripes;

import java.awt.Color;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.Resolution;

/**
 * An action bean for a regression service.
 */
public class InitActionBean extends PointsActionBean {

	@DefaultHandler
	public Resolution init() {
		getRegressionService().reset();
		getRegressionService().addPoint(1, 2, Color.BLUE);
		getRegressionService().addPoint(3, -4, Color.RED);
		getRegressionService().addPoint(2, 1, Color.GREEN);
		return Constants.EVENT_LIST;
	}
}
