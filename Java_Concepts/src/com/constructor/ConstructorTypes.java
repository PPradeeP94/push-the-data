package com.constructor;

import java.sql.Driver;

public class ConstructorTypes {
	int a =5;
	
	public ConstructorTypes() {
		System.out.println("Default");
	}
	public ConstructorTypes(int a) {
	//	a=this.a;
		//this.a=a;
		System.out.println("int");
	}
	public ConstructorTypes(String b) {
		System.out.println("string");
	}
	public ConstructorTypes(int c, String d) {
		System.out.println("int string"+c);
	}
	public static void main(String[] args) {
		ConstructorTypes ct = new ConstructorTypes();
		ConstructorTypes ct1= new ConstructorTypes(10);
		ConstructorTypes ct2= new ConstructorTypes("abc");
		ConstructorTypes ct3= new ConstructorTypes(8,"xyz");	
	}
// constructor is a block	
// classname and constructor name should be same
// It does not have any return type
// It supports method overload but not override
// whenever obj is created constructor will call automatically
// it supports implicity method
// It accepts all access specifier public private,protected, default	
// constructor should not be a static or abstract keywords	
	
	
	// To intalize the variable
	
	
	
	

}
