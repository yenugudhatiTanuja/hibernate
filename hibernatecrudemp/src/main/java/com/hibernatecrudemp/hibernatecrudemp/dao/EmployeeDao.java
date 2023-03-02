package com.hibernatecrudemp.hibernatecrudemp.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
//import javax.transaction.Transactional;

import com.hibernatecrudemp.hibernatecrudemp.model.Employee;
import com.hibernatecrudemp.hibernatecrudemp.util.EmployeeUtil;

public class EmployeeDao {
	public void saveEmp(Employee emp) {
        Transaction transaction = null;
        try  {
            // start the transaction
        	Session session = EmployeeUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            // save student object
            session.save(emp);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
	public void updateEmp(String ename,int eid)
	{
		Transaction transaction = null;
        try  {
            // start the transaction
        	Session session = EmployeeUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Query q=session.createQuery("update Employee set ename=:ename where eid=:eid");
            q.setParameter("ename", ename);
            q.setParameter("eid", eid);
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
	public void deleteEmp(int eid)
	{
		Transaction transaction = null;
        try  {
            // start the transaction
        	Session session = EmployeeUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Query q=session.createQuery("delete from Employee where eid=:eid");
            q.setParameter("eid", eid);
            int i=q.executeUpdate();
            if(i>0)
            {
                System.out.println("successfully deleted "+eid+ "employeeid record ");	
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
	public void  getEmployeeList()
	{
		Transaction transaction = null;
        try  {
            // start the transaction
        	Session session = EmployeeUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Query query=session.createQuery("from Employee");
        	List<Employee> arr=query.list();
        	for(Employee s:arr)
        	{
        		System.out.println("id: "+s.getEid()+" Name: "+s.getEname()+" Salary: "+s.getEsalary());
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
	
	public void searchById(int eid)
	{
		Transaction transaction = null;
        try  {
            // start the transaction
        	Session session = EmployeeUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            
            Query query=session.createQuery("from Employee where eid=:eid");
            query.setParameter("eid", eid);
            List<Employee> arr1=query.list();
        	for(Employee s:arr1)
        	{
        		System.out.println("id: "+s.getEid()+" Name: "+s.getEname()+" Salary: "+s.getEsalary());
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
	public void sortEmp()
	{
		Transaction transaction = null;
        try  {
            // start the transaction
        	Session session = EmployeeUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Query query=session.createQuery("from Employee order by ename desc");
        	List<Employee> arr=query.list();
        	for(Employee s:arr)
        	{
        		System.out.println("id: "+s.getEid()+" Name: "+s.getEname()+" Salary: "+s.getEsalary());
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
   public void countEmp()
   {
	   Transaction transaction = null;
       try  {
           // start the transaction
       	Session session = EmployeeUtil.getSessionFactory().openSession();
           transaction = session.beginTransaction();
           Query query=session.createQuery("count(eid) from employee");
           for(Iterator it=query.iterate();it.hasNext();)
           {
            long row = (Long) it.next();
            System.out.print("Count: " + row);
           }
       /*List<Employee> arr=query.list();
       	for(Employee s:arr)
       	{
       		System.out.println("id: "+s.getEid()+" Name: "+s.getEname()+" Salary: "+s.getEsalary());
       	}*/
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
