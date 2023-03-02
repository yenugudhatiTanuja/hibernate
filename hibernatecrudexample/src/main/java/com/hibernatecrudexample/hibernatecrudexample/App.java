package com.hibernatecrudexample.hibernatecrudexample;

import java.util.Scanner;

import com.hibernatecrudexample.hibernatecrudexample.dao.LearnerDao;
import com.hibernatecrudexample.hibernatecrudexample.model.Learner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	while(true)
    	{
    		System.out.println("1.Add Learner details");
    		System.out.println("2.Update Learner details");
    		System.out.println("3.Delete Learner details");
    		System.out.println("4.sort Learner details");
    		System.out.println("5.display Learner details");
    		System.out.println("6.Exit");
    		System.out.println("Enter your choice");
    		Scanner s=new Scanner(System.in);
            int ch=s.nextInt();
            switch(ch)
            {
            case 1:
            	LearnerDao ld=new LearnerDao();
            	System.out.println("Enter learner name");
            	String name=s.next();
            	System.out.println("Enter learner degree");
                String degree=s.next();
            	System.out.println("Enter learner city");
                String city=s.next();
            	Learner l= new Learner(name, degree, city);
            	ld.saveLearner(l);
                System.out.println("Learner Record successfully Added");
            case 2:

            	ld.updateLearner("", 0);
            }

    	
    	
    	
    	}
    }
}
