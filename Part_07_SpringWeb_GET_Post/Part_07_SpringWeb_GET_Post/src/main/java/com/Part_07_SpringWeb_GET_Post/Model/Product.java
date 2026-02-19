package com.Part_07_SpringWeb_GET_Post.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok is a Java library that helps reduce boilerplate code.
//Boilerplate code means:Getters, Setters, Constructors, toString(), equals(), hashCode()
//Instead of writing them manually, Lombok generates them automatically at compile time using annotations.
//Q: Is Lombok a runtime library?
//Ans.No, it works at compile time using annotation processing.
//Lombok is very useful for reducing boilerplate code and improving readability. However, it should be used carefully because it hides generated code and may cause debugging or maintainability issues in large projects.

@Data
//Generates getter + setter + toString + equals + hashCode

@AllArgsConstructor
//Creates constructor with all fields

@NoArgsConstructor
//Creates default constructor
public class Product {
	private int prodId;
	private String prodName;
	private int price;
}
