package org.program;

import java.util.Scanner;

public class Amstrong {
	static int n,r,temp,sum;
	public static void main(String[] args) {
		
//	 for (int i = 1; i<=1000; i++) {
			int n,r,sum,x;
			x=371;
			n=x;
			sum=0;
			while (n>0) {
				r=n%10;
				sum=sum+(r*r*r);
				
			      n=n/10;
			}
				if (sum==x) {
					System.out.println("Amstrong"+" = "+sum);
				}
			//	}
				else {
		System.out.println("Not Amstrong");
		} 
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int next = sc.nextInt();
		System.out.println(next);
		n=next;
		sum=0;
		while (n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if (sum==next) {
			System.out.println("Amstrong"+sum);
		}
			System.out.println("Not Amstrong"+sum);
		*/
	}
}







