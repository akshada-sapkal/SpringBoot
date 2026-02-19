package com.Part_07_SpringWeb_GET_Post.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Part_07_SpringWeb_GET_Post.Model.Product;

@Service
//It is used to mark a class that contains business logic.
//Spring automatically creates an object (bean) of this class and allows it to be injected into other classes using dependency injection.
// It is part of layered architecture
//@Service is a Spring stereotype annotation used to mark the business logic layer. When Spring Boot starts, it automatically detects the class during component scanning, creates a bean, and manages it inside the IoC container. The service layer sits between the controller and repository and is responsible for processing data and implementing application logic, which helps maintain clean architecture and separation of concerns.
public class ProductService {
	
	List<Product> products=new ArrayList<>(Arrays.asList(new Product(101,"Iphone",50000),new Product(102,"Samsung",10000)));
	
	public List<Product> getProducts(){
		return products;
	}

	public Product getProductsById(int prodId) {
		return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
	}
	
	public void addProduct(Product prod) {
		products.add(prod);
	}

}

//**** If @Component also creates bean, why use @Service,@Repository and @Controller? ****
//Ans.Yes, all stereotype annotations like @Service, @Repository, and @Controller are specializations of @Component and create Spring beans.All are managed by Spring Container and also supports Dependency Injection. However, we use them according to the application layer because they provide better readability, maintain proper layered architecture, and in case of @Repository, additional features like exception translation.



