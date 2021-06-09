package com.vm.tranning.java.JDBC;

import java.sql.DriverManager;

public class DB_Connection {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	DriverManager.getConnection("jdbc:mysql://localhost:3306/dct?verifyServerCertificate=false&useSSL=true","root","root");
	System.out.println("connected");
}
}
