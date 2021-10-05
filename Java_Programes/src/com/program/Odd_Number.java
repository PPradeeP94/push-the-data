package com.program;

public class Odd_Number {
	public static void main(String[] args) {
		  int count=0;
		for (int i = 1; i <=20; i++) {
		//	count++;
			if (i%2==1) {
			//	count++;
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}

}
