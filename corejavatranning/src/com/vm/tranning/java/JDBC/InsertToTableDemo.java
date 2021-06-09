package com.vm.tranning.java.JDBC;
import java.sql.Connection;
import java.sql.Statement;

public class InsertToTableDemo {
public static void main(String[] args) throws Exception {
	
	Connection conn = DB.connect();
	Statement stmt = conn.createStatement();
	String[] names = new String[] {"Ram","Suresh","Ravi","Kumar"};
	for(int i=0;i<names.length;i++)
	stmt.executeUpdate("insert into demo values("+(i+1)+",'"+names[i]+"')");
	
	
	
}
}
