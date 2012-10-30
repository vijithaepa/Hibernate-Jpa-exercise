package com.tutorial.hibernate.inheritance.tblperclass.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PER_CLASS_UNIT")
public class TblPerClassUnit extends TblPerClassBuilding {

	private int floorNumber;

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

}
