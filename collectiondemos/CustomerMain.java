package collectiondemos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class CustomerMain {
	public static void main(String[] args) {
		List <Customer> allCustomers = new ArrayList<Customer>();
		Customer c1= new Customer(10,"Uma","Pune",76000);
		allCustomers.add(c1);
		allCustomers.add(new Customer (11,"Anu","A",9800));
		allCustomers.add(new Customer (12,"A","g",99800));
		allCustomers.add(new Customer (13,"u","r",98600));
		allCustomers.add(new Customer (14,"n","a",97800));
		
		
		for (Customer customer:allCustomers) {
			System.out.println(customer);
		}
		Collections.sort(allCustomers);
		System.out.println("After sorting");
		for (Customer customer:allCustomers) {
			System.out.println(customer);
		}
	}

}
