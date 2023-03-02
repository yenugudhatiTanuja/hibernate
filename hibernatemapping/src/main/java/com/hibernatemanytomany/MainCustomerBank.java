package com.hibernatemanytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainCustomerBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
    	Session ses=factory.openSession();
    	Transaction tx=ses.beginTransaction();
    	/*Criteria criteria=ses.createCriteria(Customer.class);
    	
    	/*List<Bank> bankli=new ArrayList<Bank>();
    	List<Customer> customerli=new ArrayList<Customer>();
    	Bank b=new Bank(2, "SBI", "patamata");
    	ses.save(b);
    	bankli.add(b);
    	Customer c=new Customer("tanvi", "tanvi@gmail.com", "897156214");
    	ses.save(c);
    	Customer c1=new Customer("vani", "vani@gmail.com", "2154798561");
    	ses.save(c1);
    	customerli.add(c);
    	customerli.add(c1);
    	b.setCustomers(customerli);
    	c.setBanks(bankli);
    	c1.setBanks(bankli);*/
    
    	/*Query query=ses.getNamedQuery("findBankbyId");
    	query.setInteger("Id1", 1);
    	List<Bank> li=query.list();
    	for(int i=0;i<li.size();i++)
    	{
    		System.out.println("Name: "+li.get(i).getB_name());
    	}
    	if(!li.isEmpty())
    	{
    		Bank d=(Bank)li.get(0);
    		System.out.println(d);
    	}
    	Query query1=ses.getNamedQuery("getAll");
    	List<Bank> li1=query1.list();
    	for(int i=0;i<li1.size();i++)
    	{
    		System.out.println("Bank-Id-->"+li1.get(i).getB_id() +"\tBank-Name-->"+li1.get(i).getB_name() +"\tBank-Branch-->"+li1.get(i).getB_branch());
    	}
		System.out.println("Total Banks count---->"+li1.size());
    	if(!li1.isEmpty())
    	{
    		Bank d1=(Bank)li1.get(0);
    		System.out.println(d1);
    	}*/
    	/*Query q1=ses.createQuery("update Bank set b_name=:b_name, b_branch=:b_branch where b_id=:b_id");
    	q1.setParameter("b_name", "ICICI");
    	q1.setParameter("b_branch", "KrishnaLanka");
    	q1.setInteger("b_id", 1);
    	int rs=q1.executeUpdate();
    	System.out.println("updated--->"+rs);*/
    	 
    	tx.commit();
    	ses.close();
    	factory.close();
    	
	}

}
