package com.example.Part_03_Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	
//	Here we create the reference of Laptop class and by this
//  reference we are calling we are calling Laptop method but it shows 
//  NullPointerException because non-primitive reference/type which stores null value by default.
//	Laptop laptop;

//  Field Injection:Autowired is used.It is not better.
//  
	@Autowired 
	@Qualifier("laptop") //It works with constructor injection, setter injection, and field injection
//	It is used to specify the exact bean to be injected when multiple beans of the same type are present in the Spring container.
//	private Laptop laptop;
	private Computer comp;
	
//	Constructor Injection: Autowired is optional and default.
//	Constructor Injection is better
//	public Dev(Laptop laptop) {
//		this.laptop=laptop;
//	}
	
//	Setter Injection:Autowired is used
//	Setter Injection is better
//	@Autowired 
//	public void setLaptop(Laptop laptop) {
//		this.laptop=laptop;
//	}
	
	public void build() {
//		laptop.compile();
		comp.compile();
		System.out.println("Working on Awesome Project");
	}

}
