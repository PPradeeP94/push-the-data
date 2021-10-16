package com.pdf_programs;

public class Reverse_Number {

	
	public static void main(String[] args) {
		
		int a=56789;
		
		int n,sum=0,r;
		
		while (a>0) {
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		System.out.println(sum);
		
	}
}
