package com.tutorial.hibernate.manytomany.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Worker {

	@Id
	@GeneratedValue
	@Column(name = "WORKER_ID")
	private int workerId;
	private String WorkerName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "WORKER_SITE", joinColumns = @JoinColumn(name = "WORKER_ID", referencedColumnName = "WORKER_ID"), inverseJoinColumns = @JoinColumn(name = "SITE_ID", referencedColumnName = "SITE_ID"))
	private Set<Site> sites = new HashSet<Site>();

	public Worker() {

	}

	public Worker(String workerName) {
		this.WorkerName = workerName;
	}

	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public String getWorkerName() {
		return WorkerName;
	}

	public void setWorkerName(String workerName) {
		WorkerName = workerName;
	}

	public Set<Site> getSites() {
		return sites;
	}

	public void setSites(Set<Site> sites) {
		this.sites = sites;
	}

}
