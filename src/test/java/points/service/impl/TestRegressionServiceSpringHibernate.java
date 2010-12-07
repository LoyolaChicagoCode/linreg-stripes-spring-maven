package points.service.impl;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

/**
 * A Spring-supported integration test of DefaultRegressionService
 * backed by a Hibernate-based DAO.
 */
@ContextConfiguration(locations = {
	"/applicationContextService.xml",
	"/applicationContextHibernateDAO.xml",
	"/applicationContextBasicDataSource.xml"
})
@TestExecutionListeners({
	DependencyInjectionTestExecutionListener.class,
	TransactionalTestExecutionListener.class
})
public class TestRegressionServiceSpringHibernate extends TestRegressionServiceSpring { }
