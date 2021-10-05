package com.program;

public class Suffle {
	
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5,6,7,8,9,10};
		int length = a.length/2;
	//	System.out.println(length);
		
		for (int i = 1; i <=length; i++) {
			System.out.println(i);
		}
		for (int j = a.length; j >length; j--) {
			System.out.println(j);
		}
	}

}
