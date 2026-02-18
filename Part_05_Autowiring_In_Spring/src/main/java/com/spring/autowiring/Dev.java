package com.spring.autowiring;

public class Dev {
	
//	private Laptop laptop;
	private Computer com;
	
	
	public Dev() {
		System.out.println("Dev Constructor");
	}
	
	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public void build() {
		System.out.println("Working on awesome project");
		com.compile();
	}

}
