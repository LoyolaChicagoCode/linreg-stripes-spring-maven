package points.stripes;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.Resolution;

/**
 * An action bean for a regression service.
 */
public class ListActionBean extends PointsActionBean {

	@DefaultHandler
	public Resolution list() {
		setResult(getRegressionService().getResult());
		return Constants.VIEW_LIST;
	}
}
