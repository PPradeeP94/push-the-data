package com.pdf_programs;

public class Ascending_Maximum_Minimum {
	
	public static void main(String[] args) {
		
	int a[]= {13,9,7,26,16};
		
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
			System.out.println(a[a.length-1]);
			System.out.println(a[0]);
		
		
	}

	}


