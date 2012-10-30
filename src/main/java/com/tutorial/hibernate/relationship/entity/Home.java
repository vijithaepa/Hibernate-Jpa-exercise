package com.tutorial.hibernate.relationship.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOME")
public class Home implements Serializable {

	private static final long serialVersionUID = -6404476348464772566L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int homeId;
	private String address;
	private int nuberOfRooms;

	public Home() {

	}

	public Home(String address, int nuberOfRooms) {
		this.address = address;
		this.nuberOfRooms = nuberOfRooms;
	}

	public int getHomeId() {
		return homeId;
	}

	public void setHomeId(int homeId) {
		this.homeId = homeId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNuberOfRooms() {
		return nuberOfRooms;
	}

	public void setNuberOfRooms(int nuberOfRooms) {
		this.nuberOfRooms = nuberOfRooms;
	}

}
