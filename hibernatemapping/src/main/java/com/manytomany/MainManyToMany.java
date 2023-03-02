package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
    	Session ses=factory.openSession();
    	Transaction tx=ses.beginTransaction();
    	List<Stock> stockli=new ArrayList<Stock>();
    	List<Category> categoryli=new ArrayList<Category>();
    	Stock st=new Stock();
    	st.setS_id(100);
    	st.setS_name("Telivison");
    	st.setS_code("10001");
    	ses.save(st);
    	/*Stock st1=new Stock();
    	st1.setS_id(101);
    	st1.setS_name("Refregirator");
    	st1.setS_code("10002");
    	ses.save(st1);
    	stockli.add(st1);*/
    	stockli.add(st);
    	Category ct=new Category();
    	ct.setC_id(10);
    	ct.setC_name("LED_TV");
    	ct.setC_desc("Black colour, 32*53 inches ,LED display");
    	ses.save(ct);
    	Category ct1=new Category();
    	ct1.setC_id(11);
    	ct1.setC_name("SMART_TV");
    	ct1.setC_desc("White colour, 32*34 inches , display");
    	ses.save(ct1);
    	/*Category ct2=new Category();
    	ct2.setC_id(12);
    	ct2.setC_name("LG -Refregirator");
    	ct2.setC_desc("pink colour, double door");
    	ses.save(ct2);*/
    	categoryli.add(ct);
    	categoryli.add(ct1);
    	//st.getCategory().add(ct);
    	//st.getCategory().add(ct1);
    	//ct.getStock().add(st);
    //	ct.getStock().add(st);
    	//ses.save(st);
    	st.setCategory(categoryli);
    	ct.setStock(stockli);
    	ct1.setStock(stockli);
    	tx.commit();
    	ses.close();
	}

}
