package com.tutorial.hibernate.inheritance.tblperclass;

import org.hibernate.Session;
import org.junit.Test;

import com.tutorial.hibernate.AbstractTest;
import com.tutorial.hibernate.helper.BuildingHelper;
import com.tutorial.hibernate.inheritance.tblperclass.entity.TblPerClassBuilding;
import com.tutorial.hibernate.inheritance.tblperclass.entity.TblPerClassHouse;
import com.tutorial.hibernate.inheritance.tblperclass.entity.TblPerClassUnit;

/**
 * Usage of JPA Inheritance mapping-Table per Class functionality.
 * @author Vijitha Epa
 * 
 */
public class TestTablePerClassUsage extends AbstractTest {

	@Test
	public void shouldSaveHierachyInTablePerClass() {

		TblPerClassBuilding building = BuildingHelper.getTblPerClassBuilding();
		TblPerClassUnit unit = BuildingHelper.getTblPerClassUnit();
		TblPerClassHouse house = BuildingHelper.getTblPerClassHouse();

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(building);
		session.save(unit);
		session.save(house);
		session.getTransaction().commit();
		session.close();

		session = sessionFactory.openSession();
		session.beginTransaction();
		TblPerClassBuilding returnBuilding = (TblPerClassBuilding) session.get(TblPerClassBuilding.class, 1);
		assertActualAndExpected(returnBuilding.getAddress(), building.getAddress());
		session.getTransaction().commit();
		session.close();
	}
}
