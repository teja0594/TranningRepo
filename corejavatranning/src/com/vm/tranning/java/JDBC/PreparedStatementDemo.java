package com.vm.tranning.java.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo {
public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);
	System.out.print("enter id:");
	int id =sc.nextInt();
	System.out.print("enter name: ");
	String name = sc.next();
	Connection conn = DB.connect();
	PreparedStatement pstmt = conn.prepareStatement("insert into demo values(?,?)");
	pstmt.setInt(1, id);
	pstmt.setString(2, name);
	pstmt.executeUpdate();
	System.out.println("inserted");
}
}
