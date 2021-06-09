package com.vm.tranning.java.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TDMethods {
	
	Connection conn;
	List<Employee> employees;
	public TDMethods() throws Exception
	{
		this.conn = DB.connect();
		this.employees=new ArrayList<Employee>();
	}
	
	public String add(Employee e) throws SQLException
	{
		String temp="Employee with ID ";
		PreparedStatement ps = conn.prepareStatement("insert into emp11(name,salary,dept) values(?,?,?)");
		ps.setString(1, e.getName());
		ps.setInt(2, e.getSalary());
		ps.setString(3,e.getDept());
		ps.executeUpdate();
		PreparedStatement ps1 = conn.prepareStatement("select id from emp11 where name=?");
		ps1.setString(1, e.getName());
	ResultSet rs = ps1.executeQuery();
	while(rs.next())
	{
		e.setId(rs.getInt(1));
		temp=temp+rs.getInt(1);
		
	}
		return temp+" created";
		
	}
	public ResultSet viewAll() throws Exception
	{
		Statement stmt =conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp11");
		
		return rs;
	}
	public ResultSet viewbyID(int id) throws SQLException
	{
		PreparedStatement ps = conn.prepareStatement("select * from emp11 where id=?");
		ps.setInt(1, id);
		return ps.executeQuery();	
	}
	public List<Employee> getEmployees() throws SQLException
	{
		Statement stmt =conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from emp11");
		while(rs.next())
		{
			employees.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4)));
		}
		return employees;
	}
}
