package com.program;

import java.util.Scanner;

public class Palindrom {
	
	
	    public static void main(String[] args) {
		
//        	int n=181,sum=0;
//	
//	        int r,temp;
//	
//	         temp=n;
//	         while (temp>0) {
//	        	 r=temp%10;
//	        	 sum=r+(sum*10);
//	        	 temp=temp/10;
//	         }
//			
//	         if (sum==n) {
//				System.out.println("Palindrome  +"+sum);
//			}
//	         else {
//	         System.out.println("Not Palindrome  +"+sum);
//	         } 
	    	
	    	int n,r,sum;
	    	for (int i = 1; i <=200; i++) {
	    		sum=0;
	    		n=i;
	    		while (n>0) {
	    			r=n%10;
	    			sum=r+(sum*10);
	    			n=n/10;
					
				}
	    		if (sum==i) {
					System.out.println("Palindrom   ="+sum);
	    		}
			}
	    	
//	    	int n,r,sum=0;
//	    	Scanner sc=new Scanner(System.in);
//	    	System.out.println("Enter The Number");
//	    	int nextInt = sc.nextInt();
//	    	System.out.println(nextInt);
//	    	
//	    	sum=0;
//	    	n=nextInt;
//	    	while (n>0) {
//	    		r=n%10;
//	    		sum=r+(sum*10);
//	    		n=n/10;	
//			}
//	    	if (sum==nextInt) {
//	    	System.out.println("Palindrom   ="+sum);
//	    }
//	    	else {
//	    		System.out.println("Not Palindrom   ="+sum);
//			}
//	    
	    }
	    
			
}	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	


