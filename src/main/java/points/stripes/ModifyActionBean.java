package points.stripes;

import net.sourceforge.stripes.action.Resolution;
import points.domain.Point;
import points.domain.impl.DefaultPoint;

/**
 * An action bean for a regression service.
 */
public class ModifyActionBean extends PointActionBean {

	public Resolution delete() {
		if (getRegressionService().getPoint(getId()) == null) {
			setMessageKey("notfound.message");
		} else {
			getRegressionService().removePoint(getId());
			setMessageKey("delete.message");
		}
		return Constants.EVENT_LIST;
	}

	public Resolution edit() {
		setColors();
		// TODO clean this up
		setPoint((DefaultPoint) getRegressionService().getPoint(getId()));
		return Constants.VIEW_EDIT;
	}

	public Resolution editSubmit() {
		final Point p = getPoint();
		final Point q = getRegressionService().getPoint(p.getId());
		if (q.equals(p) && q.getColor().equals(p.getColor())) {
			getContext().getRequest().setAttribute(
					Constants.ATTRIBUTE_MESSAGE_KEY, "unchanged.message");
		} else {
			getRegressionService().editPoint(p.getId(), p.getX(), p.getY(),
					p.getColor());
			setMessageKey("edit.message");
		}
		return Constants.EVENT_LIST;
	}
}
