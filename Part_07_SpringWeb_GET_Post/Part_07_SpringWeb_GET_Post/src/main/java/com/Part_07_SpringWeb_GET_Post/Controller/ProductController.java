package com.Part_07_SpringWeb_GET_Post.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Part_07_SpringWeb_GET_Post.Model.Product;
import com.Part_07_SpringWeb_GET_Post.Service.ProductService;


@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
//	@RequestMapping("/products")
	
	@GetMapping("/products")
//	It is used for retrieving data
//	It is idempotent (calling multiple times does not change data)
//	It is equivalent to @RequestMapping(method = RequestMethod.GET) and is preferred in REST APIs because it improves readability and follows REST conventions.
	public List<Product> getProducts() {
		return service.getProducts();
	}
	
//	@RequestMapping("/products/{prodId}")
	@GetMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId) {
//		@PathVariable is used to take a value from the URL and give it to the method.
//		for e.g To get specific data like (/products/101) which Gives details of the one particular item.
		return service.getProductsById(prodId);	
	}
	
	@PostMapping("/products")
//	@PostMapping is used to send data to the server and create something new.
	public void addProduct(@RequestBody Product prod) {
//		@RequestBody is used when data comes from the client (Postman / React / Angular / HTML form) in JSON format
//		and Spring converts that JSON into a Java object automatically.
//		@RequestBody tells Spring:
//		Hey Spring… the data is coming inside the request (body). Please take it and convert it into my Java class.
		System.out.println(prod);
		service.addProduct(prod);
	}
}

