package com;

//import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
public class Main {
	public static void main(String[] args) {
		//Employee employee=new Employee();
	//employee.setEmployeeName("Rohan");
		
	//	System.out.println(employee);
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee employee=(Employee)factory.getBean("emp");
		System.out.println(employee);
		
		//Address a=(Address)factory.getBean("add");
		//System.out.println(a);
	}
		// TODO Auto-generated method stub

	}