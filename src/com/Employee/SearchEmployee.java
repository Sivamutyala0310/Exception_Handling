package com.Employee;

import java.util.Iterator;
import java.util.Scanner;

public class SearchEmployee extends CreateEmployee
{
	public void searchEmployee() 
	{
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		Iterator<EmployeeDetails> itr= createEmp1.iterator();
		while(itr.hasNext())
		{
			EmployeeDetails ed=itr.next();
			
		if(ed.name.equals(name))
		{
			System.out.println(ed.name+" "+ed.age+" "+ed.gender+" "+ed.joiningDate+" "+ed.phonenbr+" "+ed.skills+" "+ed.experience);
		}
		/*else
		{
			System.out.println("No details found with such name:"+name);
		}*/
		}
	}
	

}
