package com.tutorial.hibernate.relationship.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "RELATIONAL_USER_DETAIL")
public class RelationalUser implements Serializable {

	private static final long serialVersionUID = 4590414161379869254L;

	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column(name = "USER_NAME")
	private String name;
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Basic
	private String description;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "HOME_ID")
	private Home home;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_ID", nullable = false)
	private Set<RelationalAddress> address = new HashSet<RelationalAddress>();

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "COUNTRY")
	private Country country;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	public Set<RelationalAddress> getAddress() {
		return address;
	}

	public void setAddress(Set<RelationalAddress> address) {
		this.address = address;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
