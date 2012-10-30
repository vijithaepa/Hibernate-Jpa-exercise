package com.tutorial.hibernate.inheritance.joinstrategy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "JOINED_UNIT")
public class JoinedUnit extends JoinedBuilding {

	private int floorNumber;

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

}
