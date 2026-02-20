package com.example.Part_09_SpringData_JPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Part_09_SpringData_JPA.Model.Product;

@Repository
//Database Layer(DAO layer)
//Directly talks with DB using JPA / Hibernate.
//Handles save,delete,update,fetch
//It helps Spring to create bean
//It is a Spring annotation used to mark a class as a data access component
//It tells spring that this class is responsible for interacting with the database
//It translate database exceptions into Spring’s DataAccessException and makes the application cleaner and easier to maintain.
//We usually don't write @Repository because spring already knows any interface extending JpaRepository is a repository.so @Repository is optional.
public interface ProductRepo extends JpaRepository<Product,Integer>{

}

//Repository(Interface) ->Spring Data JPA interface that provides built in CRUD operations.Provide database methods.
//    |
//CrudRepository(Class)
//    |
//JpaRepository(Class)

//Spring Data JPA creates the implementation of JpaRepository at runtime using dynamic proxy and reflection. It generates a proxy class that internally uses Hibernate’s EntityManager to perform database operations
