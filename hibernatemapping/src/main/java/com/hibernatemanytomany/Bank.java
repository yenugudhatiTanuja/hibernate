package com.hibernatemanytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
//@NamedQueries({@NamedQuery(name = "findBankbyId",query = "branchName from Bank b where b.b_id=:Id1")})
@Entity
@Table(name = "bank")
@NamedQueries({@NamedQuery(name = "findBankbyId",query = "from Bank b where b.b_id=:Id1"),
@NamedQuery(name="getAll",query="from Bank b")	
})

public class Bank {
	@Id
	private int b_id;
	@Column(name="bankName")
	private String b_name;
	@Column(name="branchName")
	private String b_branch;
	@ManyToMany
	private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_branch() {
		return b_branch;
	}

	public void setB_branch(String b_branch) {
		this.b_branch = b_branch;
	}

	public Bank(int b_id, String b_name, String b_branch) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.b_branch = b_branch;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

}
