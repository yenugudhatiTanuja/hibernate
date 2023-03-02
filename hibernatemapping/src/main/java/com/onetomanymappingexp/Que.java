package com.onetomanymappingexp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

//import com.hibernatemapping.hibernatemapping.Answer;
@Entity
public class Que {
	@Id
	private int id;
	private String Q_name;
	@OneToMany
	private List<Ans> a;

	public List<Ans> getA() {
		return a;
	}

	public void setA(List<Ans> a) {
		this.a = a;
	}

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

	public Que(int id, String q_name) {
		super();
		this.id = id;
		Q_name = q_name;
	}

	public Que() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
