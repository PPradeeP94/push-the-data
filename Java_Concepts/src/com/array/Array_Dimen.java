package com.array;

public class Array_Dimen {
	
	
	public static void main(String[] args) {
		
//		int a[]= new int [5];
//		a[0]=1;
//		a[1]=2;
//		a[2]=3;
//		a[3]=4;
//		a[4]=5;
		
		int a[][]= new int [2][3];
		
		a[0][0]=0;
		a[0][1]=1;
		a[0][2]=2;
		a[1][0]=1;
		a[1][1]=2;
		a[1][2]=3;
		
		System.out.println(a.length);
		
		for (int i = 0; i <2; i++) {
			for (int j = 0; j < 3; j++) {
				
			
			System.out.println(a[i][j]);
		}
	}
	}
}




//Array---Storing multiple values in a single variable

// it supports similiar data types
// it allows duplicates
// it is a index based
//--------------------------------

// length is fixed
// high memory wastage
