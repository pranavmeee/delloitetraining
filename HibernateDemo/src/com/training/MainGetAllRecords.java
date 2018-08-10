package com.training;
import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
public class MainGetAllRecords {
	public static void main(String[] args)
	{
		Customer customer=new Customer(1,"Sharath","Bangalore",1200);
		
		//load hibernate connection
	Configuration configuration=new Configuration().configure();
//	configuration.configure();
		//create session factory
		SessionFactory factory=configuration.buildSessionFactory();
		//open session
		Session session=factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class)
				.add(Restrictions.like("customerName", "G%"));
		
		List<Customer> list = criteria.list();
		Iterator<Customer>i=list.iterator();
		//Query query=session.createQuery("from com.training.Customer");
		//Iterator<Customer> i=query.iterate();
		while(i.hasNext())
		{
			Customer c=i.next();
			System.out.println(c);
		}
		//Transaction transaction=session.beginTransaction();
		//customer=(Customer)session.get(Customer.class,2);
		System.out.println(customer);
		//customer.setBillAmount(1000);
		//session.delete(customer);
		session.save(customer);
		//transaction.commit();

		session.close();
		factory.close();
		System.out.println("Done");
		
		
	}

}