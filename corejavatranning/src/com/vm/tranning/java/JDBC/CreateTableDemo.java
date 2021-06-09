package com.vm.tranning.java.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableDemo {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dct?verifyServerCertificate=false&useSSL=true","root","root");
	Statement stmt = conn.createStatement();
	String query ="create table demo(id int,name varchar(30))";
	 stmt.executeUpdate(query);
	
}
}
