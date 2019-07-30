package com.Employee;
import java.util.*;

public class EmployeeMenuDriven 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Enter your login details");
		try
		{
			Login l=new Login();
			l.login();
			l.verify();
		}
		catch(Exception e)
		{
		try
		{
			Login l1=new Login();
			l1.login();
			l1.verify();
		}
		catch(Exception f)
		{
			try
			{
			Login l2=new Login();
			l2.login();
			l2.verify();
			}
			catch(Exception g)
			{
				System.out.println("several times attempted!please wait for 5 minutes and try again");
				Thread.sleep(5000);
			}
		}
	}

		
	}
}