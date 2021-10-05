package task_on_java;

import java.util.Scanner;

public class While_Loop {
	
	public static void main(String[] args) {
		
		for (int i = 0; i <6; i++) {
			
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The Mark");
			   	
		int n = scn.nextInt();
	//	System.out.println("mark");
		
		if (n < 50) {
			System.out.println("Failed");
		}
		else if (n>=50 && n < 60) {
			System.out.println("D Grade");
		}
		else if (n>=60 && n < 70) {
			System.out.println("C Grade");
		}
		else if (n>=70 && n < 80) {
			System.out.println("B Grade");
		}
		else if (n>=80 && n < 90) {
			System.out.println("A grade");
		}
		else if (n>=90 && n <= 100) {
			System.out.println("S Grade");
		}
		else {
			System.out.println("RE-test");
		}
	}
}
}
