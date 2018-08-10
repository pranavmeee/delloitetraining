package inheritancedemo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
		 public static void main(String[] args) {
				//load hibernate connection
				Configuration configuration = new Configuration().configure("inheritancedemo1/hello.cfg.xml");
				
				//create a sessionfactory
				SessionFactory factory = configuration.buildSessionFactory();
				
				//open session
				Session session = factory.openSession();
				
				Transaction transaction = session.beginTransaction();
		
				Employee employee=new Employee();
				employee.setEmployeeId(1);
				employee.setEmployeeName("Harish");
				session.save(employee);
				transaction.commit();
				session.close();
				factory.close();
				System.out.println("Done");
		}
}
