package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Driver Loaded");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	System.out.println("Connected");
	Statement stat = connection.createStatement();
	ResultSet rs = stat.executeQuery("select * from student_t");
	
	System.out.println("Result is");
	
	while(rs.next()) {
		System.out.println(rs.getString(1));//+ " ");
		System.out.println(rs.getString(2));//+ " ");
		System.out.println(rs.getString(3));//+ " ");
	}

}
}
