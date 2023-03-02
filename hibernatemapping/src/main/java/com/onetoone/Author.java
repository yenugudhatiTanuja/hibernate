package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int A_id;
	private String A_name;
	private String A_email;
	@OneToOne
	private Book B_id;
	
	public Book getB_id() {
		return B_id;
	}
	public void setB_id(Book b_id) {
		B_id = b_id;
	}
	public int getA_id() {
		return A_id;
	}
	public void setA_id(int a_id) {
		A_id = a_id;
	}
	public String getA_name() {
		return A_name;
	}
	public void setA_name(String a_name) {
		A_name = a_name;
	}
	public String getA_email() {
		return A_email;
	}
	public void setA_email(String a_email) {
		A_email = a_email;
	}
	public Author(String a_name, String a_email) {
		super();
		A_name = a_name;
		A_email = a_email;
	}
	
	public Author(String a_name, String a_email, Book b_id) {
		super();
		//A_id = a_id;
		A_name = a_name;
		A_email = a_email;
		B_id = b_id;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
