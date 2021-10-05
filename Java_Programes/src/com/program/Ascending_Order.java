package com.program;

public class Ascending_Order {
	
	
	public static void main(String[] args) {
		int temp;
		
		int [] a= {9,1,8,2,7,3,6,4,5,10};
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				while (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}

}
