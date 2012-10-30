package com.tutorial.hibernate.simple;

import org.hibernate.Session;
import org.junit.Test;

import com.tutorial.hibernate.AbstractTest;
import com.tutorial.hibernate.helper.UserHelper;
import com.tutorial.hibernate.simple.entity.UserDetails;

/**
 * Simple usage of JPA functionality of CRUD operations.
 * 
 * @author Vijitha Epa
 * 
 */
public class TestSimpleUsage extends AbstractTest {

	@Test
	public void shoulCreateSimpleEntitiesInDb() {
		UserDetails user1 = UserHelper.getUser(1);
		UserDetails user2 = UserHelper.getUser(2);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user1);
		session.save(user2);
		session.getTransaction().commit();
		session.close();

		session = sessionFactory.openSession();
		session.beginTransaction();
		UserDetails returnUser = (UserDetails) session.get(UserDetails.class, 1);
		assertActualAndExpected(returnUser.getName(), user1.getName());
		session.getTransaction().commit();
		session.close();
	}

}
