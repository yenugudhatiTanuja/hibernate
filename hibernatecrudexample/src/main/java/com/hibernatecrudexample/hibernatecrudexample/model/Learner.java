package com.hibernatecrudexample.hibernatecrudexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Learner")
public class Learner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	private String lname;
	private String ldegree;
	private String lcity;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLdegree() {
		return ldegree;
	}

	public void setLdegree(String ldegree) {
		this.ldegree = ldegree;
	}

	public String getLcity() {
		return lcity;
	}

	public void setLcity(String lcity) {
		this.lcity = lcity;
	}

	public Learner(String lname, String ldegree, String lcity) {
		super();
		// this.lid = lid;
		this.lname = lname;
		this.ldegree = ldegree;
		this.lcity = lcity;
	}

	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}

}
