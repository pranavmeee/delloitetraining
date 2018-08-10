package Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.deloitte.javatraining.dao.CustomerDAO;
import com.deloitte.javatraining.daoimpl.CustomerDAOImpl;
import com.deloitte.javatraining.entity.Customer;

class CustomerDAOImplTest {

	CustomerDAO customerDAO;
	Customer customer;
	@BeforeEach
	void setUp() throws Exception {
		customerDAO = new CustomerDAOImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		customerDAO = null;
	}

	@Test
	void testInsertCustomerDetails() {
		customer = new Customer(8,"Harith","Delhi",1200);
		assertEquals("Insert successful",customerDAO.insertCustomerDetails(customer));
	}

	private void assertEquals(String string, String insertCustomerDetails) {
		// TODO Auto-generated method stub
		
	}

	@Test
	void testFindByCustomerID() {//check this
		int customerId=5;
		assertEquals(true, customerDAO.isCustomerExists(customerId));
	}

	@Test
	void testIsCustomerExists() {
		int customerId=5;
		assertEquals(true, customerDAO.isCustomerExists(customerId));
		//fail("Not yet implemented");
	}

	private void assertEquals(boolean b, boolean customerExists) {
		// TODO Auto-generated method stub
		
	}

	@Test
	void testDeleteCustomer() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateCustomerID() {
		fail("Not yet implemented");
	}

	@Test
	void testListAllCustomers() {
		fail("Not yet implemented");
	}

	private void fail(String string) {
		// TODO Auto-generated method stub
		
	}

}
