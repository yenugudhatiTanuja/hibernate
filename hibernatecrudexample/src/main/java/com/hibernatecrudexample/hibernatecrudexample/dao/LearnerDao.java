package com.hibernatecrudexample.hibernatecrudexample.dao;

import org.hibernate.Query;
//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

//import com.hibernatecrudemp.hibernatecrudemp.util.EmployeeUtil;
import com.hibernatecrudexample.hibernatecrudexample.model.Learner;
import com.hibernatecrudexample.hibernatecrudexample.util.LearnerUtil;

public class LearnerDao {
	public void saveLearner(Learner l) {
		Transaction trans = null;
		try {
			Session session = LearnerUtil.getSessionFactory().openSession();
			trans = session.beginTransaction();
			session.save(l);
			trans.commit();
		} catch (Exception e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		}

	}
public void updateLearner(String city,int id)
{
	Transaction transaction = null;
    try  {
        // start the transaction
    	Session session = LearnerUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Query q=session.createQuery("update Learner set lcity=:city where lid=:id");
        q.setParameter("city", city);
        q.setParameter("id", id);
        int i=q.executeUpdate();
        if(i>0)
        {
            System.out.println("successfully updated");	
        }
       transaction.commit();
    }
    catch(Exception e)
    {
    	if(transaction!=null)
    	{
    		transaction.rollback();
    	}
    	e.printStackTrace();
    }
}
}
