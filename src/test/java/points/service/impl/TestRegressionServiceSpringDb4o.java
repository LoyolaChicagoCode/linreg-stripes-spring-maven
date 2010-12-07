package points.service.impl;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

/**
 * A Spring-supported integration test of DefaultRegressionService
 * backed by a db4o-based DAO.
 */
@ContextConfiguration(locations = {
	"/applicationContextService.xml",
	"/applicationContextDb4oDAO.xml"
})
@TestExecutionListeners({
	DependencyInjectionTestExecutionListener.class,
	TransactionalTestExecutionListener.class
})
public class TestRegressionServiceSpringDb4o extends TestRegressionServiceSpring { }
