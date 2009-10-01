package points.stripes;

import points.service.RegressionResult;

/**
 * An action bean for a regression service.
 */
public abstract class PointsActionBean extends RegressionServiceActionBean {

	private RegressionResult result;

	public RegressionResult getResult() {
		return result;
	}

	protected void setResult(final RegressionResult result) {
		this.result = result;
	}
}
