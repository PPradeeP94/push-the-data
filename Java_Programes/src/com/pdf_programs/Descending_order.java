package com.pdf_programs;

public class Descending_order {
	
	public static void main(String[] args) {
		
	int a[]= {13,9,5,26,16};
		
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

		
	}


