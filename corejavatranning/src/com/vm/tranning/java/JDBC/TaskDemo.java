package com.vm.tranning.java.JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class TaskDemo {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {


		TDMethods td = new TDMethods();
		Employee e;
		boolean flag=true;
		while(flag)
		{
			switch(Menu())
			{
			case "add":
				System.out.print("enter name: ");
					String name = sc.next();
					System.out.print("enter salary: ");
					int sal = sc.nextInt();
					System.out.print("enter dept: ");
					String dept = sc.next();
					e=new Employee(name, sal, dept);
					System.out.println(td.add(e));		
				break;
			case "viewbyid":
				System.out.print("enter Employee Id: ");
				int eid = sc.nextInt();
				ResultSet rs =td.viewbyID(eid);
				while(rs.next())
				{
					System.out.println("Name: "+rs.getString(2));
					System.out.println("Salary: "+rs.getInt(3));
					System.out.println("Department: "+rs.getString(4));
				}
				break;
			case "viewAll":
				ResultSet rs1 =td.viewAll();
				ResultSetMetaData rsd = rs1.getMetaData();
				System.out.println("Data from DataBase");
				System.out.println(rsd.getColumnName(1)+"\t"+rsd.getColumnName(2)+"\t"+rsd.getColumnName(3)+"\t"+rsd.getColumnName(4));
				while(rs1.next())
				{
					System.out.println(rs1.getInt(1)+"\t"+rs1.getString(2)+"\t"+rs1.getInt(3)+"\t"+rs1.getString(4));
				}
				System.out.println("Data as Objects:");
				td.getEmployees().forEach(p->System.out.println(p));
				System.out.println();
				
				break;
				default:
					flag=false;
					break;
			}
			
		}
		


	}
	private static String Menu()
	{
		System.out.println("Enter operatio to perform:  (add/viewbyid/viewAll)");
		return sc.next();
	}
}
