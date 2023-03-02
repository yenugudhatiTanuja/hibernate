package com.onetomanymapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
    	Session ses=factory.openSession();
    	Transaction tx=ses.beginTransaction();
    	Department d=new Department();
        //d.setD_id(102);
       // d.setD_name("Electrical science");
    	/*Employee e=new Employee();
    	e.setE_id(2);
    	e.setE_name("vanaja");
    	e.setE_address("hyderabad");
    	e.setE_phonenumber("9685743622");*/
    
    	
    	Employee e1=new Employee();
    	e1.setE_id(4);
    	e1.setE_name("harini");
    	e1.setE_address("Banglore");
    	e1.setE_phonenumber("9685743642");
    	List<Employee> li=new ArrayList<Employee>(); 
    	li.add(e1);
    	//li.add(e1);
    	d.setEmp(li);
    	e1.setDep(d);
    	ses.save(d);
    	ses.save(e1);
    	System.out.println("Added");
    	tx.commit();
    	ses.close();
	}

}
