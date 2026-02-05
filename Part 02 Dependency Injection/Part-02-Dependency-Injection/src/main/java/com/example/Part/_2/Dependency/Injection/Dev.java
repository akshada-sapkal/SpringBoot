package com.example.Part._2.Dependency.Injection;

import org.springframework.stereotype.Component;

@Component
//Tells Spring to create object of this class
public class Dev {
	public void build() {
		System.out.println("Working on awesome project");
	}

}
