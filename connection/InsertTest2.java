package com.connection;
import java.sql.*;
import java.util.Scanner;

public class InsertTest2 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Connection connection = MyConnection.getConnection();
		
		connection.setAutoCommit(false);
		
		Scanner scanner = new Scanner (System.in);
		try {
		System.out.println("Enter roll");
		int roll = scanner.nextInt();
		
		System.out.println("Enter name:");
		String name = scanner.next();
		
		System.out.println("Enter address:");
		String address = scanner.next();
		
		
		PreparedStatement statement = connection.prepareStatement("insert into student_t values(?,?,?)");
		
		statement.setInt(1, roll);
		statement.setString(2, name);
		statement.setString(3, address);
		
		statement.executeUpdate();
		
		
		System.out.println("Enter roll");
		int roll2 = scanner.nextInt();
		
		System.out.println("Enter name:");
		String name2 = scanner.next();
		
		System.out.println("Enter address:");
		String address2 = scanner.next();
		
		
		PreparedStatement statement2 = connection.prepareStatement("insert into student_t values(?,?,?)");
		
		statement2.setInt(1, roll2);
		statement2.setString(2, name2);
		statement2.setString(3, address2);
		
		statement.executeUpdate();
		connection.commit();
		connection.close();
		
	}catch (Exception e) {
		connection.rollback();
		e.printStackTrace();
	}
	}

}
