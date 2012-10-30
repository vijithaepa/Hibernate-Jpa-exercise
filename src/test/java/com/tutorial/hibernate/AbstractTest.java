package com.tutorial.hibernate;

import static org.junit.Assert.assertEquals;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Before;

public abstract class AbstractTest {

	protected SessionFactory sessionFactory;

	@Before
	public void setUp() {
		if (null == sessionFactory) {
			Configuration configuration = new Configuration().configure("test-hibernate.cfg.xml");
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
			                .buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}
	}

	public final <T> void assertActualAndExpected(T actual, T expected) {
		assertEquals(actual, expected);
	}
}
