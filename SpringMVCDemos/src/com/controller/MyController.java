package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.javatraining.entity.Customer;

@Controller
public class MyController {

	@RequestMapping("/Go")
	public ModelAndView pp()
	{
		return new ModelAndView("mohan","mymsg","Hello from servlet");
	}
	@RequestMapping("/data")
	public ModelAndView data(Customer customer)
	{
		return new ModelAndView("data","cust",customer);
	}
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/customer")
	public ModelAndView  c()
	//public String index() {
		return new ModelAndView("customer","command",new Customer());
	}
}