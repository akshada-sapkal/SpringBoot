package com.example.Part_09_SpringData_JPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Entity is a JPA annotation that marks a Java class as a database table. Hibernate maps the class fields to table columns and automatically performs database operations without writing SQL queries.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
//	@Id is used to define the primary key of the entity, which uniquely identifies each record in the database table.
	private int prodId;
	private String prodName;
	private int price;
	
//	@GeneratedValue : automatically generates the value of that primary key (usually auto-increment) so we don’t need to set it manually.
//	Types of Generation Strategies:
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	IDENTITY → Uses MySQL auto-increment.
//	Other types (you can just know names):
//	AUTO
//	SEQUENCE (Oracle/PostgreSQL)
//	TABLE (rarely used)

}
