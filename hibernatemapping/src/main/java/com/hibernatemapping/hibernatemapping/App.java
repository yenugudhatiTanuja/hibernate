package com.hibernatemapping.hibernatemapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

//import com.hibernatemanytomany.Customer;
//import com.hibernatemanytomany.cus;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//List<Question> li1=new ArrayList<Question>();
    	SessionFactory factory= new Configuration().configure().buildSessionFactory();
    	Session ses=factory.openSession();
    	Transaction tx=ses.beginTransaction();
    	//Question q=new Question();
    	Criteria criteria=ses.createCriteria(Question.class);
    	List<Question> quslist=criteria.list();
    	/*for(Question qus:quslist)
    	{
    		System.out.println("Id: "+qus.getId()+"\tsolution---> "+qus.getA_id().getA_solution());
    	}*/
    	
    	/*quslist = ses.createCriteria(Question.class)
				.add(Restrictions.like("Q_name", "%h%"))
				.list();
		for(Question qus : quslist){
			System.out.println("Answer having 'h' in Question::"+qus.getId()+"\tsolution---> "+qus.getA_id().getA_solution());
		}*/
    	/*long count = (Long) ses.createCriteria(Question.class)
				.setProjection(Projections.rowCount())
				.add(Restrictions.like("Q_name", "%h%"))
				.uniqueResult();
		System.out.println("Number of question with 'h' in name="+count);*/
   /*   Query query = ses.createQuery("select sum(id) from Question");
      //double sumid =(Double) query.uniqueResult();
      System.out.println("sum is ---->"+query.list().get(0));
      
      Query query1 = ses.createQuery("select max(id) from Question");
      //double sumid =(Double) query.uniqueResult();
      System.out.println("max is ---->"+query1.list().get(0));
      
     Query query2 = ses.createQuery("select min(id) from Question");
      //double sumid =(Double) query.uniqueResult();
      System.out.println("min is ---->"+query2.list().get(0));
      Query query3 = ses.createQuery("select avg(id) from Question");
      //double sumid =(Double) query.uniqueResult();
      System.out.println("avg is ---->"+query3.list().get(0));
    	
    	//Query query=ses.createQuery("update Q_name )
     Query query4 = ses.createQuery("select count(id) from Question");
      //int countid =(Integer) query1.list().get(0);
      System.out.println("count is ---->"+query4.list().get(0));*/
    	
        //Query query=ses.createQuery("update Question set Q_name=:Q_ )

    	/*q.setId(27);
    	q.setQ_name("JDBC");
    	Answer a=new Answer();
    	a.setA_id(507);
    	a.setA_solution("Java database connection");
    	q.setA_id(a);
    	ses.save(q);
    	ses.save(a);
    	System.out.println("Added");
    	/*List<?> q1=ses.createQuery("from Question").list();
    	for(Iterator<?> it=q1.iterator();it.hasNext();)
    	{
    		Question qu=(Question) it.next();
    		System.out.println("Q -"+qu.getId()+" : "+qu.getQ_name());
    		Answer an=(Answer)qu.getA_id();
    		System.out.println("A-"+an.getA_id()+ " :"+an.getA_solution());
    	}*/
    	tx.commit();
    	ses.close();
    	factory.close();
    }
}
