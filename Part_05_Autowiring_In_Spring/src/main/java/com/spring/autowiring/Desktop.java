package com.spring.autowiring;

public class Desktop implements Computer{
	
	public Desktop() {
		System.out.println("Desktop Constructor");
	}
	public void compile() {
		System.out.println("Compiling in Desktop");
	}

}
