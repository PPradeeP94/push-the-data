package org.program;

public class Palindrome {
	static int n,r,sum;
	public static void main(String[] args) {
		for (int i = 1; i <200; i++) {
			n=i;
			sum=0;
			while (n>0) {
				r=n%10;
				sum=r+(sum*10);
				n=n/10;	
			}
			if (sum==i) {
				System.out.println("palindrome "  +" = "+sum);
			}}
		 
			System.out.println("Not Palindrome");
	
	}
}
