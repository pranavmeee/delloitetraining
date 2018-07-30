package com.connection;
import java.sql.*;

public class InsertTest {
	public static void main(String[] args) throws SQLException {
		
	
	Connection connection = MyConnection.getConnection();
	Statement statement=connection.createStatement();
	int rowsAffected = statement.executeUpdate("insert into student_t values(5,'Rishabh', 'Mangaluru')");
    System.out.println(rowsAffected + "row(s) updated successfully");
    
    connection.close();
}

}
