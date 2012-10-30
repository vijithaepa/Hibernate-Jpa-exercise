package com.tutorial.hibernate.embedded.entity;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="EMBEDDED_ADDRESS")
public class EmbeddedAddress {

	private String street;
	private String city;
	private String state;
	private String pinCode;

	public EmbeddedAddress() {

	}

	public EmbeddedAddress(String street, String city, String state, String pinCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

}
