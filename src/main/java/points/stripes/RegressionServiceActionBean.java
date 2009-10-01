package points.stripes;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.integration.spring.SpringBean;
import points.service.RegressionResult;
import points.service.RegressionService;

/**
 * An action bean for a regression service.
 */
public abstract class RegressionServiceActionBean implements ActionBean {

	// TODO automated testing

	private RegressionService regressionService;

	@SpringBean("regressionService")
	public void injectRegressionService(
			final RegressionService regressionService) {
		this.regressionService = regressionService;
	}

	protected RegressionService getRegressionService() {
		return regressionService;
	}

	private ActionBeanContext context;

	@Override
	public ActionBeanContext getContext() {
		return context;
	}

	@Override
	public void setContext(final ActionBeanContext context) {
		this.context = context;
	}

	private RegressionResult result;

	public RegressionResult getResult() {
		return result;
	}

	protected void setResult(final RegressionResult result) {
		this.result = result;
	}
}
