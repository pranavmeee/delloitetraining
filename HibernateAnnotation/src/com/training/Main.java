package com.training;
import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
public class Main {
	public static void main(String[] args)
	{
		Customer customer=new Customer(1,"Sharath","Mys",98000);
		//customer.setCustomerId(2);
		//load hibernate connection
		AnnotationConfiguration configuration=new AnnotationConfiguration();
		configuration.configure();
		//create session factory
		SessionFactory factory=configuration.buildSessionFactory();
		//open session
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		//customer=(Customer)session.get(Customer.class,2);
		System.out.println(customer);
		//customer.setBillAmount(1000);
		//session.delete(customer);
		session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("Done");
		
		
	}

}
