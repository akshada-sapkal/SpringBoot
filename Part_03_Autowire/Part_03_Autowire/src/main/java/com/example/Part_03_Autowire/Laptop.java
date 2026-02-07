package com.example.Part_03_Autowire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //It is used when multiple beans of the same type exist, to specify which bean should be injected by default during dependency injection.
public class Laptop implements Computer {

	public void compile() {
		System.out.println("Compiling with 404 bugs");
		
	}
	
}
