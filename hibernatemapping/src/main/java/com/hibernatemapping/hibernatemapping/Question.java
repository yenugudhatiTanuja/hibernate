package com.hibernatemapping.hibernatemapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int id;
	private String Q_name;
	@OneToOne
	@JoinColumn(name = "A_id")
	private Answer A_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQ_name() {
		return Q_name;
	}

	public void setQ_name(String q_name) {
		Q_name = q_name;
	}

	public Answer getA_id() {
		return A_id;
	}

	public void setA_id(Answer a_id) {
		A_id = a_id;
	}

}
