package com.tutorial.hibernate.inheritance.tblperhierarchy.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Large_building")
public class House extends Building {

	private int areaOfGarden;

	public int getAreaOfGarden() {
		return areaOfGarden;
	}

	public void setAreaOfGarden(int areaOfGarden) {
		this.areaOfGarden = areaOfGarden;
	}

}
