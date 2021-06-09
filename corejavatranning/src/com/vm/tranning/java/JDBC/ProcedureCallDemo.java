package com.vm.tranning.java.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ProcedureCallDemo {
public static void main(String[] args) throws Exception{
	Connection conn = DB.connect();
	String query ="call EmpCountbySal(?,?)";
	CallableStatement cs = conn.prepareCall(query);
	cs.setString(1,"@count");
	cs.setInt(2, 50000);
	ResultSet rs = cs.executeQuery();
	ResultSetMetaData rsd = rs.getMetaData();
	System.out.println(rsd.getColumnName(1));
	System.out.println("----------------------------");
	while(rs.next())
	{
		System.out.println(rs.getInt(1));
	}
	
}
}
