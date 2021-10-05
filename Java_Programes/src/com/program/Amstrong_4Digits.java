package com.program;

public class Amstrong_4Digits {
	
	public static void main(String[] args) {
//		int n=1634,sum=0;
//		int r,temp;
//		
//		temp=n;
//		while (temp>0) {
//			r=temp%10;
//			sum=sum+(r*r*r*r);
//			temp=temp/10;
//		}
//		if (sum==n) {
//			System.out.println("Armstrong Number  = "+sum);
//		}
//		else {
//			System.out.println("Not Armstrong Number  = "+sum);
//			
//		}
		
//		int n,r,sum;
//		for (int i = 1; i <=10000; i++) {
//			sum=0;
//			n=i;
//			while (n>0) {
//				r=n%10;
//				sum=sum+(r*r*r);
//				n=n/10;
//			}
//			if (sum==i) {
//				System.out.println("Armstrong Number  = "+sum);
//			}
//			sum=0;
//			n=i;
//	
//		while (n>0) {
//			r=n%10;
//			sum=sum+(r*r*r*r);
//			n=n/10;
//		}
//		if (sum==i) {
//			System.out.println("Armstrong Number  = "+sum);
//		}
//		}
		int n=20000;
		int r,count,temp;
		double sum;
		for (int i = 0; i <n ; i++) {
			sum=0;
			count=0;
			
		
		    //while
			temp=i;
		//	temp=0;
			count++;
			
			r=temp%10;
			sum=Math.pow(r, count);
			temp=temp/10;
			
			if (sum==i) {
				System.out.println("Amstrong Number   =  "+sum);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
