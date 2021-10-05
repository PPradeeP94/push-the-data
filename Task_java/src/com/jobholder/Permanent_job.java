package com.jobholder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Permanent_job {
	
	// static String a = "Unmarried";
	// static String b = "Married";
	// static String c="Temporary";
	 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Job Holder: permanent/temporary");;
		String job = sc.next();
		System.out.println(job);
		
		System.out.println("married/unmarried");
		String next = sc.next();
		System.out.println(next);
		
		System.out.println("service");
		 int service = sc.nextInt();
		System.out.println(service);
	
	//	System.out.println("Loan Amount");
	//	 int loan = sc.nextInt();
	//	System.out.println(loan);
		
		if (job.equalsIgnoreCase("permanent")) {
			if (next.equalsIgnoreCase("married")) {
			if (service < 30) {
					System.out.println("loan amount will be 35,000");
				}
			else {
					System.out.println("loan amount will be 60,000");
				}
			}
			else if (next.equalsIgnoreCase("unmarried")) {
				if(service<30) {
					System.out.println("loan amount will be 25,000");
				}
				else {
					System.out.println("loan amount will be 50,000");
				}
			} 
			
		}
		else {
			System.out.println("loan amount will be 10000");
		}
		
		
	}

}
