package org.program;

public class Butter_Fly {
	
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,10};
	//	int len=a.length/2;
		int len=5;
		for (int i =len-1 ; i >=0; i--) {
			System.out.println(a[i]);
		}
		for (int j = a.length-1; j>=len; j--) {
			System.out.println(a[j]);
		
	}
	}
}
