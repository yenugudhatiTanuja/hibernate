package com.hibernatecrudemp.hibernatecrudemp;

import com.hibernatecrudemp.hibernatecrudemp.dao.EmployeeDao;
import com.hibernatecrudemp.hibernatecrudemp.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDao ed=new EmployeeDao();
        //Employee e=new Employee("haritha", "40000");
       // ed.saveEmp(e);
        //ed.updateEmp("mounika", 2);
    	//ed.deleteEmp(3);
    	//ed.getEmployeeList();
        //ed.searchById(2);
    	//ed.sortEmp();
    	ed.countEmp();
    }
}
