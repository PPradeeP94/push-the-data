package org.program;

public class Fiboncci {
	
	static int s1=2,s2=4,s3=6;
	int s;
	
	public static void main(String[] args) {
		int s=0;
		for (int i = 1; i <=10; i++) {
		 s =s1+s2+s3;
			s1=s2;
			s2=s3;
			s3=s;
			System.out.println(s);
		}
			System.out.println(s);
		
	}

}
