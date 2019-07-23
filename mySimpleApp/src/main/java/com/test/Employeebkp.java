package com.test;

import java.util.Scanner;

public class Employee {

	public EmployeeDetails employee() {
	Scanner scan=new Scanner(System.in);
	EmployeeDetails detl=new EmployeeDetails();
	System.out.println("Enter Name here...");
	detl.setName(scan.next());
		/*
		 * System.out.println("Enter Dept here..."); detl.setDept(scan.next());
		 * System.out.println("Enter ID here..."); detl.setMobile(scan.nextInt());
		 */
	return detl;
	
}	
}
