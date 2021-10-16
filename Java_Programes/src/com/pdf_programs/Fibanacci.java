package com.pdf_programs;

public class Fibanacci {
	
	public static void main(String[] args) {
		
		int a=1,b=2,c;
		
		for (int i = 0; i <10; i++) {
			c=a+b;
			
			a=b;
			b=c;
			
			System.out.println(c);
		}
		
	}

}
