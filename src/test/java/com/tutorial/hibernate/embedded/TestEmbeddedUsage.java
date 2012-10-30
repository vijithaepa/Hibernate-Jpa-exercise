package com.tutorial.hibernate.embedded;

import org.hibernate.Session;
import org.junit.Test;

import com.tutorial.hibernate.AbstractTest;
import com.tutorial.hibernate.embedded.entity.EmbeddedlUser;
import com.tutorial.hibernate.helper.UserHelper;

/**
 * Usage of JPA Embedded functionality.
 * @author Vijitha Epa
 *
 */
public class TestEmbeddedUsage extends AbstractTest {

	@Test
	public void shoulCreateEmbeddedEntitiesInDb() {
		EmbeddedlUser userDetails = UserHelper.getUserWithEmbeddedAddress(1);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();
		session.close();

		session = sessionFactory.openSession();
		session.beginTransaction();
		EmbeddedlUser returnUser = (EmbeddedlUser) session.get(EmbeddedlUser.class, 1);
		assertActualAndExpected(returnUser.getName(), userDetails.getName());
		session.getTransaction().commit();
		session.close();
	}
}
