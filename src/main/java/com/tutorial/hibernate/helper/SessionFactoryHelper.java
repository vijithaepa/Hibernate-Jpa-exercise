package com.tutorial.hibernate.helper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SessionFactoryHelper {

	private static SessionFactory sessionFactory;

	private SessionFactoryHelper() {

	}

	public static SessionFactory getSessionFactory() {

		if (null == sessionFactory) {
			Configuration configuration = new Configuration().configure();
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
			                .buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}

		return sessionFactory;

	}

	public static Session getSession(String configFileName) {
		Configuration configuration = new Configuration().configure(configFileName);
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		return sessionFactory.openSession();

	}
}
