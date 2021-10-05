package com.program;

public class Descending_Order {
	
	public static void main(String[] args) {
		int temp;
		int count=0;
		int [] b= {9,1,8,2,7,3,6,4,5,10};
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				while (b[i]<b[j]) {
					temp=b[j];
					b[j]=b[i];
					b[i]=temp;
					count++;
				}
			}	
		}
		for (int k = 0; k < b.length; k++) {
			System.out.println(b[k]);	
		}
		System.out.println(count);
	}

}
