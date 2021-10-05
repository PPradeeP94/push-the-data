package com.program;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		int n,r,sum;
		for (int i = 1; i <=1000; i++) {
			sum=0;
			n=i;
			while (n>0) {
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
			}
			if (sum==i) {
			System.out.println("Amstrong Number  ="+sum);
			}
		}
		
//		int n=153,sum=0;
//		int r,temp;
//		temp=n;
//		while (temp>0) {
//			r=temp%10;
//			sum=sum+(r*r*r);
//			temp=temp/10;
//		}
//		if (sum==n) {
//			System.out.println("Armstrong Number  ="+sum);
//		}
		
		
//		int n,r,sum;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Number");
//		int nextInt = sc.nextInt();
//		System.out.println(nextInt);
//		sum=0;
//		n=nextInt;
//		while (n>0) {
//			r=n%10;
//			sum=sum+(r*r*r);
//			n=n/10;
//		}
//		if (sum==nextInt) {
//			System.out.println("Armstrong Number  ="+sum);
//		}
//		else {
//			System.out.println("Not Armstrong Number  ="+sum);
//		}
		
	
	}

}
