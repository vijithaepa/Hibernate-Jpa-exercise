package com.tutorial.hibernate.inheritance.joinstrategy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "JOINED_HOUSE")
public class JoinedHouse extends JoinedBuilding {

	private int areaOfGarden;

	public int getAreaOfGarden() {
		return areaOfGarden;
	}

	public void setAreaOfGarden(int areaOfGarden) {
		this.areaOfGarden = areaOfGarden;
	}

}
