package com.pdf_programs;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int a= 153;
		
		int r,sum=0,n;
		
		n=a;
		
		while (n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if (sum==a) {
			System.out.println("Armstrong  "+sum);
		}
//==================================================================================================================================		
		
		
		for (int i = 0; i <1000; i++) {
			
			int x,y=0,z;
			
			x=i;
			while (x>0) {
				z=x%10;
				y=y+(z*z*z);
				x=x/10;
			}
			if (y==i) {
				System.out.println("Armstrong "+y);
			}
				
		}
		
		
		
		
		
		
		
		}
}

