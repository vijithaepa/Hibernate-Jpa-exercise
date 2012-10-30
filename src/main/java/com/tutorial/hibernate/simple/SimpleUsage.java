package com.tutorial.hibernate.simple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.tutorial.hibernate.helper.UserHelper;
import com.tutorial.hibernate.simple.entity.UserDetails;


/**
 * Simple usage of JPA functionality of CRUD operations.
 * @author Vijitha Epa
 *
 */
public class SimpleUsage {

	public static void main(String[] args) {
		UserDetails user1 = UserHelper.getUser(1);
		UserDetails user2 = UserHelper.getUser(2);

		Configuration configuration = new Configuration().configure("hibernate.cfg_simple.xml");
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user1);
		session.save(user2);
		session.getTransaction().commit();
		session.close();

		session = sessionFactory.openSession();
		session.beginTransaction();
		UserDetails returnUser = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println(returnUser.getName());
		session.getTransaction().commit();
		session.close();

	}

}
