package com.program;

public class Fiboncci {
	/*
	public static void main(String[] args) {
		int f,f1=2,f2=3,f3=1;
		
		for (int i = 1; i <=10; i++) {
			f=f1+f2+f3;
		//	System.out.println(f);
		
		f1=f2;
		f2=f3;
		f3=f;
		
		
		System.out.println(f);
		}
		
	} */
	
	
	public static void main(String[] args) {
		
		int f,f1=1,f2=2;
    	int n=0;
    	while (n<5) {
    		
			f=f1+f2;
			f1=f2;
			f2=f;
			n++;
			
			System.out.println(f);
		}
			
	}
}


























