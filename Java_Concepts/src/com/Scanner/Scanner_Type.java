package com.Scanner;

import java.util.Scanner;

public class Scanner_Type {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id");
		int nextInt = sc.nextInt();
		System.out.println(nextInt);
		
		System.out.println("Enter Student Name");
		String next = sc.next();
		System.out.println(next);
		
		System.out.println("Enter Student Details");
		String nextLine = sc.nextLine();
		System.out.println(nextLine);
		
		System.out.println("Enter Student character");
		char charAt = sc.nextLine().charAt(5);
		System.out.println(charAt);
		
		System.out.println("Enter Student character");
		char charAt1 = sc.next().charAt(5);
		String nextLine2 = nextLine;
		System.out.println(nextLine2);
		System.out.println(charAt1);
		
		System.out.println("Enter student class");
		double nextDouble = sc.nextDouble();
		System.out.println(nextDouble);
		
	//	String nextLine2 = nextLine;
		
	}
	
}
// Scanner is a class
// getting input from the user
// package for Scanner (java.util.scanner)






