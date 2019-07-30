package com.Employee;
import java.util.*;
public class Employee
{
	public void employee()
	{
		do {
		System.out.println("for employee creation press 1 & searching employee details press 2");
		Scanner scan=new Scanner(System.in);
		int s=scan.nextInt();
		switch (s)
		{
		case 1:
		CreateEmployee createEmp=new CreateEmployee();
		createEmp.createEmployee();
		break;
		case 2:
		System.out.println("Please enter name of the employee you want to search");
		SearchEmployee search=new SearchEmployee();
		search.searchEmployee();
		break;
		default:
			System.out.println("no details found");
		}
		}while(true);
		
	}
	
	
}

