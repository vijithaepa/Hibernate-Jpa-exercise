package com.tutorial.hibernate.embedded.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "EMBEDDED_USER_DETAIL")
public class EmbeddedlUser implements Serializable {

	private static final long serialVersionUID = 4590414161379869254L;

	@Column(name = "USER_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column(name = "USER_NAME")
	private String name;
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Transient
	private int userCount;

	@ElementCollection
	@JoinTable(name = "ADDRESS", joinColumns = @JoinColumn(name = "USER_ID"))
	@GenericGenerator(name = "hilo-generator", strategy = "hilo")
	// used for generate colection Id
	@CollectionId(columns = @Column(name = "ADDRESS_ID"), generator = "hilo-generator", type = @Type(type = "long"))
	@NotFound(action = NotFoundAction.IGNORE)
	private List<EmbeddedAddress> address = new ArrayList<EmbeddedAddress>();

	@Basic
	private String description;

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

	public int getUserCount() {
		return userCount;
	}

	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}

	public List<EmbeddedAddress> getAddress() {
		return address;
	}

	public void setAddress(List<EmbeddedAddress> address) {
		this.address = address;
	}

}
