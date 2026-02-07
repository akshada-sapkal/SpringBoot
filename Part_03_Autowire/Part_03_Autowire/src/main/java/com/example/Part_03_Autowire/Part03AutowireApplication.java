package com.example.Part_03_Autowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Part03AutowireApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Part03AutowireApplication.class, args);
		Dev obj=context.getBean(Dev.class);
		obj.build();
	}

}
