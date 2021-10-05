package org.program;

public class Prime_Number {
	 
	static int s;
	
	public static void main(String[] args) {
		for (int i = 1; i <20; i++) {
			for (int j = 2; j<i; j++) {
				s=0;
				if (i%j==0) {
					s=1;
					break;
						}
				}
				if (s==0) {
				System.out.println(i);
	
			}	
		}
	}
	
	

}



























