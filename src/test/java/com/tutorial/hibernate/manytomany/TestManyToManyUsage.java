package com.tutorial.hibernate.manytomany;

import org.hibernate.Session;
import org.junit.Test;

import com.tutorial.hibernate.AbstractTest;
import com.tutorial.hibernate.helper.UserHelper;
import com.tutorial.hibernate.manytomany.entity.Worker;

/**
 * Many-To-Many relational usage of JPA functionality of CRUD operations.
 * @author Vijitha Epa
 *
 */
public class TestManyToManyUsage extends AbstractTest {

	@Test
	public void shoulCreateManyToManyEntitiesInDb() {

		Worker user1 = UserHelper.getWorker();

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user1);
		session.getTransaction().commit();
		session.close();

		session = sessionFactory.openSession();
		session.beginTransaction();
		Worker returnUser = (Worker) session.get(Worker.class, 1);
		assertActualAndExpected(returnUser.getSites().size(), user1.getSites().size());
		session.getTransaction().commit();
		session.close();
	}
}
