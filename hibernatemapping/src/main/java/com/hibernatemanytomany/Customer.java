package com.hibernatemanytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(generator = "Id_generator")
	@GenericGenerator(name = "Id_generator",strategy ="org.hibernate.id.enhanced.SequenceStyleGenerator",
			parameters = { @Parameter(name="sequence_name", value="user_sequence"),
								      @Parameter(name ="initial_value",value="1001"),
									  @Parameter(name="increment_size",value = "1")})

	private int c_id;
	private String c_name;
	private String c_email;
	private String c_mobilenum;
	@ManyToMany
	private List<Bank> banks;

	public List<Bank> getBanks() {
		return banks;
	}

	public void setBanks(List<Bank> banks) {
		this.banks = banks;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_email() {
		return c_email;
	}

	public void setC_email(String c_email) {
		this.c_email = c_email;
	}

	public String getC_mobilenum() {
		return c_mobilenum;
	}

	public void setC_mobilenum(String c_mobilenum) {
		this.c_mobilenum = c_mobilenum;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String c_name, String c_email, String c_mobilenum) {
		super();
		this.c_name = c_name;
		this.c_email = c_email;
		this.c_mobilenum = c_mobilenum;
	}

}
