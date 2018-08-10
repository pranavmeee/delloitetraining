package com;

import java.text.Annotation;

//import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
	public static void main(String[] args) {
		//Employee employee=new Employee();
	//employee.setEmployeeName("Rohan");
		
	//	System.out.println(employee);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee=context.getBean(Employee.class);
		Address  Address =context.getBean(Address.class);
		employee.setEmployeeName("Pranav");
		//Address.setaId(67);
		//Address.setCity("Pune");
		//Address.setState("Karnataka");
		System.out.println(employee);
		Employee e=context.getBean(Employee.class);
		employee.setAddress(Address);
		System.out.println(e);
		//Address address=context.getBean(Address.class);
		
	}
		// TODO Auto-generated method stub

	}