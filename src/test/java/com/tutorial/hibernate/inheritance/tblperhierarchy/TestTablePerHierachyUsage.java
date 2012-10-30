package com.tutorial.hibernate.inheritance.tblperhierarchy;

import org.hibernate.Session;
import org.junit.Test;

import com.tutorial.hibernate.AbstractTest;
import com.tutorial.hibernate.helper.BuildingHelper;
import com.tutorial.hibernate.inheritance.tblperhierarchy.entity.Building;
import com.tutorial.hibernate.inheritance.tblperhierarchy.entity.House;
import com.tutorial.hibernate.inheritance.tblperhierarchy.entity.Unit;

/**
 * Usage of JPA Inheritance mapping-Table per hierarchy functionality.
 * 
 * @author Vijitha Epa
 * 
 */
public class TestTablePerHierachyUsage extends AbstractTest {

	@Test
	public void shouldSaveHierachyInSingleTable() {

		Building building = BuildingHelper.getBuilding();
		Unit unit = BuildingHelper.getUnit();
		House house = BuildingHelper.getHouse();

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(building);
		session.save(unit);
		session.save(house);
		session.getTransaction().commit();
		session.close();

		session = sessionFactory.openSession();
		session.beginTransaction();
		Building returnBuilding = (Building) session.get(Building.class, 1);
		assertActualAndExpected(returnBuilding.getAddress(), building.getAddress());
		session.getTransaction().commit();
		session.close();
	}
}
