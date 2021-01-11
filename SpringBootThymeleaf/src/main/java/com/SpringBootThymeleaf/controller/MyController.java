package com.SpringBootThymeleaf.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value ="/about",method = RequestMethod.GET)
	public String about()
	{
		System.out.println("Inside about handler...");
		return "about";
		//about.html
	}
	
	@RequestMapping(value ="/contact",method = RequestMethod.GET)
	public String contact()
	{
		System.out.println("Inside about handler...");
		return "contact";
		//contact.html
	}
	
	@RequestMapping(value ="/home",method = RequestMethod.GET)
	public String home()
	{
		System.out.println("Inside about handler...");
		return "home";
		//home.html
	}
	
}
