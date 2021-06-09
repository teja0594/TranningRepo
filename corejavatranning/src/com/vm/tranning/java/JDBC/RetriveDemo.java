package com.vm.tranning.java.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetriveDemo  {
public static void main(String[] args) throws Exception {
	
	Connection conn = DB.connect();
	Statement stmt = conn.createStatement();
	ResultSet rs =  stmt.executeQuery("select * from demo");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
		
	}
	
	
}
}
