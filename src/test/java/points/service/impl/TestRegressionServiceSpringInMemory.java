package points.service.impl;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

/**
 * A Spring-supported integration test of DefaultRegressionService
 * backed by an in-memory DAO.
 */
@ContextConfiguration(locations = {
	"/applicationContextService.xml",
	"/applicationContextInMemoryDAO.xml"
})
@TestExecutionListeners({
	DependencyInjectionTestExecutionListener.class,
})
public class TestRegressionServiceSpringInMemory extends TestRegressionServiceSpring { }
