package com.hibernatemapping.hibernatemapping;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Answer {
	@Id
    private int A_id;
    private String A_solution;
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
    
}
