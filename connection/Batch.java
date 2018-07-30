package com.connection;
import java.sql.*;
import java.util.Scanner;

public class Batch {
	public static void main(String[] args) throws SQLException{
		Connection connection = MyConnection.getConnection();
		
		connection.setAutoCommit(false);
	
		
		Statement stmt = connection.createStatement();
		stmt.addBatch("INSERT INTO STUDENT_T VALUES('10','Vasudha','Mysuru')");
		stmt.addBatch("INSERT INTO STUDENT_T VALUES('11','Vasu','Mysuru')");
		stmt.addBatch("INSERT INTO STUDENT_T VALUES('12','Amrutha','Mysuru')");
		
		int [] updateCounts = stmt.executeBatch();
		connection.commit();
		connection.close();
		

	}

}
