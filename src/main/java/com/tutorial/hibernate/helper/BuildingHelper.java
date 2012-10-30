package com.tutorial.hibernate.helper;

import com.tutorial.hibernate.inheritance.joinstrategy.entity.JoinedBuilding;
import com.tutorial.hibernate.inheritance.joinstrategy.entity.JoinedHouse;
import com.tutorial.hibernate.inheritance.joinstrategy.entity.JoinedUnit;
import com.tutorial.hibernate.inheritance.tblperclass.entity.TblPerClassBuilding;
import com.tutorial.hibernate.inheritance.tblperclass.entity.TblPerClassHouse;
import com.tutorial.hibernate.inheritance.tblperclass.entity.TblPerClassUnit;
import com.tutorial.hibernate.inheritance.tblperhierarchy.entity.Building;
import com.tutorial.hibernate.inheritance.tblperhierarchy.entity.House;
import com.tutorial.hibernate.inheritance.tblperhierarchy.entity.Unit;

/**
 * Helper class to create Building instances.
 * 
 * @author Vijitha Epa.
 * 
 */
public class BuildingHelper {

	public static Building getBuilding() {
		Building building = new Building();
		building.setAddress("1116A, Glenhuntly");
		return building;
	}

	public static Unit getUnit() {
		Unit unit = new Unit();
		unit.setAddress("1116A, Glenhuntly");
		unit.setFloorNumber(3);
		return unit;
	}

	public static House getHouse() {
		House house = new House();
		house.setAddress("1116A, Glenhuntly");
		house.setAreaOfGarden(6);
		return house;
	}

	public static TblPerClassBuilding getTblPerClassBuilding() {
		TblPerClassBuilding building = new TblPerClassBuilding();
		building.setAddress("1116A, Glenhuntly");
		return building;
	}

	public static TblPerClassUnit getTblPerClassUnit() {
		TblPerClassUnit unit = new TblPerClassUnit();
		unit.setAddress("1116A, Glenhuntly. Unit 1");
		unit.setFloorNumber(3);
		return unit;
	}

	public static TblPerClassHouse getTblPerClassHouse() {
		TblPerClassHouse house = new TblPerClassHouse();
		house.setAddress("1116A, Glenhuntly. House 1");
		house.setAreaOfGarden(6);
		return house;
	}

	public static JoinedBuilding getJoinedBuilding() {
		JoinedBuilding building = new JoinedBuilding();
		building.setAddress("1116A, Glenhuntly");
		return building;
	}

	public static JoinedUnit getJoinedUnit() {
		JoinedUnit unit = new JoinedUnit();
		unit.setAddress("1116A, Glenhuntly. Unit 1");
		unit.setFloorNumber(3);
		return unit;
	}

	public static JoinedHouse getJoinedHouse() {
		JoinedHouse house = new JoinedHouse();
		house.setAddress("1116A, Glenhuntly. House 1");
		house.setAreaOfGarden(6);
		return house;
	}
}
