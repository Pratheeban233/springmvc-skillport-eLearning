package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Organization {

	public static void main(String[] args) {
		//Employee emp=new Employee();
	//	EmployeeDetails detl=null;
		
		//ApplicationContext appcontext=new FileSystemXmlApplicationContext("appContext.xml");
		ApplicationContext appcontext=new ClassPathXmlApplicationContext("com/testPackage/appContext.xml");
		
		Employee emp=appcontext.getBean("employee", Employee.class);
		EmployeeDetails detl=(EmployeeDetails) appcontext.getBean("employeedetails");
		EmployeeDetails detl1=(EmployeeDetails) appcontext.getBean("employeedetails");
		
		
		
		//detl=emp.employee();
		detl.setName("Prathi");
		//det=emp.employee();
		System.out.println("The Output is...");
		System.out.println(detl.getName());
		//System.out.println(detl.getDept());
		//System.out.println(detl.getMobile());
		
		System.out.println(detl1.getName());
		
	}

}
