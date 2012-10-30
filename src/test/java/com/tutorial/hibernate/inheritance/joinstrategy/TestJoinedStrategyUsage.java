package com.tutorial.hibernate.inheritance.joinstrategy;

import org.hibernate.Session;
import org.junit.Test;

import com.tutorial.hibernate.AbstractTest;
import com.tutorial.hibernate.helper.BuildingHelper;
import com.tutorial.hibernate.inheritance.joinstrategy.entity.JoinedBuilding;
import com.tutorial.hibernate.inheritance.joinstrategy.entity.JoinedHouse;
import com.tutorial.hibernate.inheritance.joinstrategy.entity.JoinedUnit;

/**
 * Usage of JPA Inheritance mapping-Joined functionality.
 * @author Vijitha Epa
 *
 */
public class TestJoinedStrategyUsage extends AbstractTest {

	@Test
	public void shouldSaveHierachyInJoinedStrategy() {

		JoinedBuilding building = BuildingHelper.getJoinedBuilding();
		JoinedUnit unit = BuildingHelper.getJoinedUnit();
		JoinedHouse house = BuildingHelper.getJoinedHouse();

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(building);
		session.save(unit);
		session.save(house);
		session.getTransaction().commit();
		session.close();

		session = sessionFactory.openSession();
		session.beginTransaction();
		JoinedBuilding returnBuilding = (JoinedBuilding) session.get(JoinedBuilding.class, 1);
		assertActualAndExpected(returnBuilding.getAddress(), building.getAddress());
		session.getTransaction().commit();
		session.close();
	}
}
