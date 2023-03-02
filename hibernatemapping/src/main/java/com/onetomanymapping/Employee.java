package com.onetomanymapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	private int e_id;
	private String e_name;
	private String e_address;
	private String e_phonenumber;
	
	@ManyToOne
    private Department dep;
	
	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getE_address() {
		return e_address;
	}

	public void setE_address(String e_address) {
		this.e_address = e_address;
	}

	public String getE_phonenumber() {
		return e_phonenumber;
	}

	public void setE_phonenumber(String e_phonenumber) {
		this.e_phonenumber = e_phonenumber;
	}

}
