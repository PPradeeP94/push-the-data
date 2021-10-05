package org.program;

public class Armstrong_4Digits {
	
	public static void main(String[] args) {
		
		int []a=new int[5];
		a[0]=1;
		a[1]=153;
		a[2]=370;
		a[3]=371;
		a[4]=407;
		
		int n,r,sum;
		
		for (int i =0; i <5; i++) {
			
		//	n=i;
			n=a[i];
			sum=0;
			while (n!=0) {
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;	
			}
			if (a[i]==sum) {
				System.out.println("Armstrong NUmber  ="+sum);
			}
			else {
				System.out.println("Not Armstrong NUmber  = "+sum);
			}
	}
				
		
	}

}
