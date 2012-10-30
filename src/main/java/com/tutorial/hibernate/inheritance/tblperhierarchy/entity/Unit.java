package com.tutorial.hibernate.inheritance.tblperhierarchy.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Small_building")
public class Unit extends Building {

	private int floorNumber;

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

}
