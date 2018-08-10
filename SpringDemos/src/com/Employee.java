package com;

public class Employee {

	private String employeeName;
	private Address Address;
	
	
	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public Address getAddress() {
		return Address;
	}


	public void setAddress(Address address) {
		this.Address = address;
	}


	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", Address=" + Address + "]";
	}


	public Employee()
	{
		System.out.println("Employee called");
	}


	public Employee(String employeeName) {
		super();
		this.employeeName = employeeName;
	}
	

}
