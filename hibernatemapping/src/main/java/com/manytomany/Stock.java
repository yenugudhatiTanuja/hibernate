package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Stock {
	@Id
	private int s_id;
	@Column(name = "Stock_code",unique = true)
	private String s_code;
	@Column(name ="Stock_name",unique = true)
	private String s_name;
	@ManyToMany
	private List<Category> category;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_code() {
		return s_code;
	}

	public void setS_code(String s_code) {
		this.s_code = s_code;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
