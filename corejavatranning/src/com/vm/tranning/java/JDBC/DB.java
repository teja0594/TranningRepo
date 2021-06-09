package com.vm.tranning.java.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection connect() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return  DriverManager.getConnection(DBProperties.Url,DBProperties.User,DBProperties.password);
		
	}
	public static Connection connect(String dbname) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return  DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname+"?verifyServerCertificate=false&useSSL=true",DBProperties.User,DBProperties.password);
		
	}
}
