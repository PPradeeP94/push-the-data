package com.pdf_programs;

public class Palindrome {

	public static void main(String[] args) {
		
		int a=121;
		
		int sum=0,r,n;
		
		n=a;
		
		while (n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if (sum==a) {
			System.out.println("palindrome "+sum);
		}
//=====================================================================
		
		
		
		for (int i = 1; i <=100; i++) {
			
			int x=0,y,z;
			
			z=i;
			while (z>0) {
				y=z%10;
				x=(x*10)+y;
				z=z/10;
			}
			if (x==i) {
			
			System.out.println("palindrome "+x);
		}
		}
		
		
	}

}
