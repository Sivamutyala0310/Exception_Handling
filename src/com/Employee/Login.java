package com.Employee;

import java.util.Scanner;

public class Login 
{
	String username="siva";
	String password="123";
	String username1;
	String password1;
	public void login()
	{
		Scanner scan=new Scanner(System.in);	
		System.out.println("enter username");
		 username1=scan.nextLine();
		System.out.println("enter password");
		password1=scan.nextLine();
	}
		public void verify() throws Exception
		{
			System.out.println(username1);
			if(username1.equals(username)&&password1.equals(password))
			{
				System.out.println("loggined successfully");
				Employee emp=new Employee();
				emp.employee();	
			}
			
			else
			{
				InvalidLoginDetails ild=new InvalidLoginDetails();
				System.out.println(ild.getMessage());
				throw ild;
			}
			
	  }

	}


