package com.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTest {
	public static void main(String[] args) throws SQLException {
		
		
		Connection connection = MyConnection.getConnection();
		Statement statement=connection.createStatement();
		
		statement.execute("create table student_z (roll numeric,sname varchar2(20))");
		
		System.out.println("Table created");
	}
	

}
