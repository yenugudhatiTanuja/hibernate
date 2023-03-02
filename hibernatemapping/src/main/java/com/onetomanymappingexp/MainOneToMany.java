package com.onetomanymappingexp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
    	Session ses=factory.openSession();
    	Transaction tx=ses.beginTransaction();
    	/*Que l=new Que(101,"what is jdk");
    	ses.save(l);
    	Ans s=new Ans(10,"java development toolkit",l);
    	ses.save(s);
    	Ans s1=new Ans(11,"java virtual machine",l);
    	ses.save(s1);
    List<Ans> t=new ArrayList<Ans>();
     	t.add(s);
    	t.add(s1);
    	l.setA(t);*/
    	List<?> q1=ses.createQuery("from Que").list();
    	for(Iterator<?> iter=q1.iterator();iter.hasNext();)
    	{
    		Que q=(Que) iter.next();
    		System.out.println("Q-"+q.getId()+" : "+q.getQ_name());
    		Ans an=(Ans) q.getA();
    		System.out.println("A-"+an.getA_id()+" : "+an.getA_solution());
    	}
    	System.out.println("Added");
    	tx.commit();
    	ses.close();
    	
    
	}

}
