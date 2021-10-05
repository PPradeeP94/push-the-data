package com.casting;

public class Type_Casting {

	
	
//	byte  =	  8bits  1byte
//	short =   16bits 2byte
//	int   =   32bits 4byte
//	long  =   64bits 8byte
//	float =   32bits 4byte
//	double =  64bits 8byte
//	char   =  16bits 2byte
//	boolean =  true/false;
	
	
 static	char c ='a';
	int b= 12;
	
	static int i =(int)c;

	static short a=12;
	static int e =a;
	
	static int d =12;
	static double e1=d;
	
	static double x=12.34;
	static int y =(int)x;

	
	
	
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(e);
		System.out.println(e1);
		System.out.println(y);
	}
	
}


// converting a value from one data type to another data type---- Type casting
// converting a lower data type to higher data type      --------  Widening
// converting a Higher data type to lower data type        ------- Narrowing


// upcasting is the type casting of child obj to parent    ----UPcasting
// Downcasting is the casting of parent obj to child       ----Downcasting
     // It is not possible













