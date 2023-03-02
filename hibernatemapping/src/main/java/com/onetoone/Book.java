package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Book {
	@Id
	//@GeneratedValue(generator = "Id_generator")
	@GeneratedValue(generator = "Id_generator")
	@GenericGenerator(name = "Id_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "user_sequence"),
			@Parameter(name = "initial_value", value = "1001"), @Parameter(name = "increment_size", value = "1") })
	private int B_id;
	private String B_name;
	private String B_desc;
	private int B_price;

	public int getB_id() {
		return B_id;
	}

	public void setB_id(int b_id) {
		B_id = b_id;
	}

	public String getB_name() {
		return B_name;
	}

	public void setB_name(String b_name) {
		B_name = b_name;
	}

	public String getB_desc() {
		return B_desc;
	}

	public void setB_desc(String b_desc) {
		B_desc = b_desc;
	}

	public int getB_price() {
		return B_price;
	}

	public void setB_price(int b_price) {
		B_price = b_price;
	}

	public Book(String b_name, String b_desc, int b_price) {
		super();
		//B_id = b_id;
		B_name = b_name;
		B_desc = b_desc;
		B_price = b_price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

}