package com.deloitte.javatraining.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.deloitte.javatraining.DBConnection.DBConnection;
import com.deloitte.javatraining.dao.CustomerDAO;
import com.deloitte.javatraining.entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	
	Connection connection = DBConnection.getConnection();
	int results;
	private Customer customer;

	@Override
	public String insertCustomerDetails(Customer customer) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into customer values (?,?,?,?)");
			preparedStatement.setInt(1,customer.getCustomerId());
			preparedStatement.setString(2,customer.getCustomerName());
			preparedStatement.setString(3,customer.getCustomerAddress());
			preparedStatement.setInt(4,customer.getBillAmount());
			results = preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		if (results ==0)
			return "insert failed";
		else
			return "insert success";
	}

	@Override
	public Customer findByCustomerID(int customerId) {
		Customer customer = new Customer();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("select * from customer where customerID=?");
			statement.setInt(1, customerId);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setCustomerName(resultSet.getString(2));
			customer.setCustomerAddress(resultSet.getString(3));
			customer.setBillAmount(resultSet.getInt(4));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement;
		boolean recordexists=false;
		try {
			preparedStatement  = connection.prepareStatement("select * from customer where customerId=?");
			preparedStatement.setInt(1,customer.getCustomerId());
			ResultSet data=preparedStatement.executeQuery();
			recordexists=data.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		PreparedStatement preparedStatement;
		boolean delete=false;
		try {
		preparedStatement  = connection.prepareStatement("delete * from customer where customerId=?");
		preparedStatement.setInt(1,customer.getCustomerId());
		ResultSet data=preparedStatement.executeQuery();
		delete=data.next();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return false;
	}

	@Override
	public Customer updateCustomerID(int customerId, Customer customer) {

		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("select * from customer where customerID=?");
			statement.setInt(1, customerId);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setCustomerName(resultSet.getString(2));
			customer.setCustomerAddress(resultSet.getString(3));
			customer.setBillAmount(resultSet.getInt(4));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customer;
	
	}
	@Override
	public List<Customer> listAllCustomers() {
		
		// TODO Auto-generated method stub
		return null;
	}

}
