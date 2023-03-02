package com.onetomanymappingexp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Ans {
	@Id
    private int A_id;
    private String A_solution;
    @ManyToOne
    private Que q;
    
	public Que getQ() {
		return q;
	}
	public void setQ(Que q) {
		this.q = q;
	}
	public int getA_id() {
		return A_id;
	}
	public void setA_id(int a_id) {
		A_id = a_id;
	}
	public String getA_solution() {
		return A_solution;
	}
	public void setA_solution(String a_solution) {
		A_solution = a_solution;
	}
	public Ans(int a_id, String a_solution, Que q) {
		super();
		A_id = a_id;
		A_solution = a_solution;
		this.q = q;
	}
	public Ans() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
