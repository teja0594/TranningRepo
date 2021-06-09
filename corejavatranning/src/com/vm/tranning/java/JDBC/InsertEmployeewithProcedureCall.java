package com.vm.tranning.java.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class InsertEmployeewithProcedureCall {
public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
	String name = sc.next();
	int salary= sc.nextInt();
	int depid = sc.nextInt();
	int age = sc.nextInt();
	Connection conn = DB.connect();
	String query ="call AddEmployee(?,?,?,?,?)";
	CallableStatement cs = conn.prepareCall(query);
	cs.setInt(1, id);
	cs.setString(2,name);
	cs.setInt(3, salary);
	cs.setInt(4, depid);
	cs.setInt(5, age);
	 cs.executeUpdate();
	 CallableStatement cs1 = conn.prepareCall("call EmployeebyID(?)");
	 cs1.setInt(1,id);
	 ResultSet rs=cs1.executeQuery();
	ResultSetMetaData rsd = rs.getMetaData();
	System.out.println(rsd.getColumnName(1)+" "+rsd.getColumnName(2)+" "+rsd.getColumnName(3));
	System.out.println("----------------------------------------------");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	
}
}
