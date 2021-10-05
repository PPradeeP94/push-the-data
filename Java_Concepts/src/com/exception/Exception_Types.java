package com.exception;

import java.util.Scanner;

public class Exception_Types {
	
	public static void main(String[] args) {
		
	       // Arithmetic Exception
		
		double a= 209.9/0;
		
		System.out.println(99.7/0);
		
	      //  	Null pointer
		
		String b="abc";
		System.out.println(b.toUpperCase());
		String c=null;
	//	System.out.println(c.toLowerCase());
		
       // input misMatch		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int nextInt = sc.nextInt();
		System.out.println(nextInt);
		
		// Number Format 
		
		String d= "4500";
		int parseInt = Integer.parseInt(d);
		System.out.println(parseInt+d);

// string
//StringBuffer 
//StringBuilder	
//Exception	
//static block and static method		
		
		
		
	}


}
