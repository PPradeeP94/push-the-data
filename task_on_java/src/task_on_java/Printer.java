package task_on_java;

import  java. util.*;

public class Printer {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value");
		int n = sc.nextInt();
		System.out.println(n);
		
		System.out.println("enter name");
		String sl = sc.nextLine();
		System.out.println(sl);
		
		System.out.println("Enter name");
		String nx = sc.next();
		System.out.println(nx);
		
		System.out.println("Character");
		char cr= sc.next().charAt(1);
		System.out.println(cr);
		
		System.out.println("Name");
		String nt = sc.next();
		System.out.println(nt);
	}

}
