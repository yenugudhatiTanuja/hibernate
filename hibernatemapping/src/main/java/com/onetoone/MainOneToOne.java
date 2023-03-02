package com.onetoone;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
    	Session ses=factory.openSession();
    	Transaction tx=ses.beginTransaction();
    	/*Book b1=new Book("dbms","database management System",1000);
    	ses.save(b1);
    	Author a1=new Author("kiran","kiran@gmail.com",b1);
    	ses.save(a1);
    	Book b2=new Book("SE","software enginner",1500);
    	ses.save(b2);
    	Author a2=new Author("kushijan","kushijan@gmail.com",b2);
    	ses.save(a2);*/
    	
    	/*update Function*/
    	/*Query q1=ses.createQuery("update Book set B_name=:B_name, B_desc=:B_desc where B_id=:B_id");
    	q1.setParameter("B_name", "DLD");
    	q1.setParameter("B_desc", "digital logic design");
    	q1.setInteger("B_id", 1001);
    	int rs=q1.executeUpdate();
    	System.out.println("updated--->"+rs);*/
    	
    	
    	/*Delete function*/
    	
    	/*Query q2=ses.createQuery(" delete Book where B_id=:B_id"); 
    	q2.setParameter("B_id", 2);
    	int rs=q2.executeUpdate();
    	System.out.println("success--->"+rs);*/
    	
    	/*display particular id record*/
    	
    	/*Query q3=ses.createQuery("from Book where B_id=:B_id ");
    	q3.setInteger("B_id", 1002);
    	List<Book> li=q3.list();
    	for(int i=0;i<li.size();i++)
    	{
    		System.out.println("Id: "+li.get(i).getB_id() +"\n Name: "+li.get(i).getB_name()+"\ndescription: "+li.get(i).getB_desc()+"\nprice:"+li.get(i).getB_price());
    	}
    	if(!li.isEmpty())
    	{
    		Book bk=(Book)li.get(0);
    		System.out.println(bk);
    	}*/
    	
    	/*Orderby function*/
    	
    	/*Query q3=ses.createQuery("from Book order by B_price ");
    	List<Book> li=q3.list();
    	for(int i=0;i<li.size();i++)
    	{
    		System.out.println("Id: "+li.get(i).getB_id() +"\n Name: "+li.get(i).getB_name()+"\ndescription: "+li.get(i).getB_desc()+"\nprice:"+li.get(i).getB_price());
    		System.out.println("*********");
   	
    	}
    	if(!li.isEmpty())
    	{
    		Book bk=(Book)li.get(0);
    		//System.out.println(bk);
    		//System.out.println("*********");
    	}*/
    	
    	 /* Aggregations*/
    	
    	/*Query query = ses.createQuery("select sum(B_price) from Book");
        System.out.println("sum is ---->"+query.list().get(0));
        
        Query query1 = ses.createQuery("select max(B_price) from Book");
        System.out.println("max is ---->"+query1.list().get(0));
        
       Query query2 = ses.createQuery("select min(B_price) from Book");
        System.out.println("min is ---->"+query2.list().get(0));
        
        Query query3 = ses.createQuery("select avg(B_price) from Book");
        System.out.println("avg is ---->"+query3.list().get(0));
      	
       Query query4 = ses.createQuery("select count(B_id) from Book");
        System.out.println("count is ---->"+query4.list().get(0));*/
    	
    	/*groupby*/
    	
      	Query q5=ses.createQuery("")
    	tx.commit();
    	ses.close();
	}

}
