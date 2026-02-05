package com.example.Part._2.Dependency.Injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//Tells Spring Boot to start auto-configuration and component scanning
public class Part02DependencyInjectionApplication {

	public static void main(String[] args) {
		
		// Step 1: Start the Spring Boot application
		// This creates the Spring Container (ApplicationContext)
//		ApplicationContext: Spring container that holds all objects (beans
		ApplicationContext context=SpringApplication.run(Part02DependencyInjectionApplication.class, args);
		
       //  Dev obj=new Dev();
      //   You create object manually
      //   Dev obj=null;
		
		// Step 2: Ask Spring to give the object (bean) of Dev class
		// Instead of creating object using 'new', Spring provides it.
//		getBean(Dev.class)=Ask Spring: “Give me Dev object”
		Dev obj=context.getBean(Dev.class);
		
		
		
		// Step 3: Call method using the Spring-managed object
		obj.build();
	}

}
