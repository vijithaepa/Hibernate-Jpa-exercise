package com.tutorial.hibernate.manytomany.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Site {

	@Id
	@GeneratedValue
	@Column(name = "SITE_ID")
	private int siteId;
	private String siteName;

	@ManyToMany(mappedBy = "sites")
	private Set<Worker> workers = new HashSet<Worker>();

	public Site() {

	}

	public Site(String siteName) {
		this.siteName = siteName;
	}

	public int getSiteId() {
		return siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public Set<Worker> getWorkers() {
		return workers;
	}

	public void setWorkers(Set<Worker> workers) {
		this.workers = workers;
	}

}
