package com.pdf_programs;

public class Prime_Number {
	
	public static void main(String[] args) {
		int sum;
		int count=0;
		for (int i = 2; i <100 ; i++) {
			sum=0;
			for (int j = 2; j <i; j++) {
				if (i%j==0) {
					sum=1;
					break;
				}
			}
			if (sum==0) {
				count++;
				System.out.println(i);
			}	}
				System.out.println("Count "+count);
			
		
	}
	
}

