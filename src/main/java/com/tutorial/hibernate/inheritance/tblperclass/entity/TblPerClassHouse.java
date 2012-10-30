package com.tutorial.hibernate.inheritance.tblperclass.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PER_CLASS_HOUSE")
public class TblPerClassHouse extends TblPerClassBuilding {

	private int areaOfGarden;

	public int getAreaOfGarden() {
		return areaOfGarden;
	}

	public void setAreaOfGarden(int areaOfGarden) {
		this.areaOfGarden = areaOfGarden;
	}

}
