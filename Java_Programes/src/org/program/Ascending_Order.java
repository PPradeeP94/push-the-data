package org.program;

import java.lang.reflect.Array;

public class Ascending_Order {
	
	public static void main(String[] args) {
		 int temp;
		int []a= {3,9,4,8,2,12,1};
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
