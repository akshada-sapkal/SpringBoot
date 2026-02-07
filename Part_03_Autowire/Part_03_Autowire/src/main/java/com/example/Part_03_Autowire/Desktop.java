package com.example.Part_03_Autowire;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
	@Override
	public void compile() {
		System.out.println("Compiling with 404 bugs but faster");
	}
	
}
