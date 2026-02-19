package com.example.Part06_SpringBoot_Web;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//It handles user HTTP requests from the browser and returns the appropriate view page as a response.
//If we use only @Controller, Spring treats the return value as a view name and tries to locate a JSP/HTML page. If the page is not present, it throws a 404 error. To return data instead of a page, we use @ResponseBody or @RestController
// Handles requests
// It is used for websites (login page, home page, forms)

@RestController
//Handles client requests and returns data directly in the HTTP response body instead of returning a view page.
//It returns data in JSON/text
//It is used to create REST API that return data directly to the client.
//It is combination of @Controller and @ResponseBody
//It is used for backend API (React, Angular, mobile app, Postman)

public class HomeController {
	
	@RequestMapping("/")
//	It is the heart of Spring MVC.
//	It is used to connect a browser/client request (URL) with a Java method in the Controller class.
//	It is used to map HTTP request to specific controller method
//	We can use it at Class level and Method Level
//	for e.g @Controller
//	@RequestMapping("/user")   // class level
//	public class UserController {
//
//	    @RequestMapping("/login")  // method level
//	    public String login() {
//	        return "login.jsp";
//	    }
//	}
	
//	@ResponseBody
//	It sends the method’s return data directly to the client (browser) instead of returning a view page(JSP or HTML page).
//	Sends data directly to browser.
	public String greet() {
		return "Welcome to the Home";
	}
	
//	@RequestMapping("/about")
//	@ResponseBody
	public String about() {
		return "About us!!";
	}

}
