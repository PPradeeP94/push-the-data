package com.pdf_programs;

public class Ascending_Order {
	
	public static void main(String[] args) {
		
		int a[]= {13,9,5,26,16};
		
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
