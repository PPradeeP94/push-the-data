package com.pdf_programs;

public class Number_Count {
	
	public static void main(String[] args) {
		
		int a=12345;
		
		int sum=0,r;
		
		while (a>0) {
			r=a%10;
			sum=sum+r;
			a=a/10;
			
		}
		System.out.println(sum);
	}

}
