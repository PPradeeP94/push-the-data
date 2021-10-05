package org.program;

public class Descending_Order {
	
	public static void main(String[] args) {
		  int temp;
		int [] a= {12,34,6,19,3};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}		}	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
		

}
}