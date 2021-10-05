package com.javaprogr;

public class Duplicate_Array {
	
	public static void main(String[] args) {
		
		int [] a= {30,20,10,5,10,12,5};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[j]);
				}
				//System.out.println(j);
			}
			//System.out.println(j);
			
		}
		
	}

}
