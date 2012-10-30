package com.tutorial.hibernate.relationship;

import org.hibernate.Session;
import org.junit.Test;

import com.tutorial.hibernate.AbstractTest;
import com.tutorial.hibernate.helper.UserHelper;
import com.tutorial.hibernate.relationship.entity.RelationalUser;

/**
 * One-to-One, One-to-Many, Many-to-One relational usage of JPA functionality of
 * CRUD operations.
 * 
 * @author Vijitha Epa
 * 
 */
public class TestRelationalUsage extends AbstractTest {

	@Test
	public void shoulCreateRelationalEntitiesInDb() {
		RelationalUser userDetails = UserHelper.getUserWithRelationalAddress(1);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();
		session.close();

		session = sessionFactory.openSession();
		session.beginTransaction();
		RelationalUser returnUser = (RelationalUser) session.get(RelationalUser.class, 1);
		assertActualAndExpected(returnUser.getName(), userDetails.getName());
		session.getTransaction().commit();
		session.close();
	}

}
