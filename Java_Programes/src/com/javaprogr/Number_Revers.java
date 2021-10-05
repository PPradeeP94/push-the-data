package com.javaprogr;

import java.util.Arrays;
import java.util.Scanner;

public class Number_Revers {
	
	public static void main(String[] args) {
		
		int a=12345; //54321
		
		int n,r,sum;
		n=a;
		sum=0;
		while (n>0) {
			r=n%10;
			sum=r+(sum*10);   //5,
			n=n/10; 
			//1234
			//System.out.println(sum);
		}
		System.out.println(sum);
			
	}
	

}
