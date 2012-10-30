package com.tutorial.hibernate.inheritance.tblperclass.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PER_CLASS_BUILDING")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TblPerClassBuilding {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "BUILDING_ID")
	private int id;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
