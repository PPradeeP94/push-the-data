package com.goods;

import java.util.Scanner;

public class Goods_Dispatch {
	
	public static void Urgent() {
		Scanner wa=new Scanner(System.in);
		System.out.println("Enter The weight");
		int nextIa = wa.nextInt();
		System.out.println(nextIa);
		
		if (nextIa<5) {
			System.out.println("Transport Done by Post");
		}
		Scanner da=new Scanner(System.in);
		System.out.println("Enter The Distance");
		int nextda = wa.nextInt();
		System.out.println(nextda);
		
		if (nextIa>5) {
			if (nextda<=250) {
				System.out.println("Transport Done by Lorry");
			}
		}
		else {
			System.out.println("Transport Done by Train");	
		}
		 if (nextIa<100) {
			if (nextda<50) {
				System.out.println("Transport Done by Van");
			}
		}
		else {
			System.out.println("Transport Done by Train");
		}
	}
	public static void Non_Urgent() {
		Scanner wb=new Scanner(System.in);
		System.out.println("Enter The weight");
		int nextIb = wb.nextInt();
		System.out.println(nextIb);
		
		if (nextIb<5) {
			System.out.println("Transport Done by Post");
		}
		Scanner da=new Scanner(System.in);
		System.out.println("Enter The Distance");
		int nextda = wb.nextInt();
		System.out.println(nextda);
		
		if (nextIb>5) {
			if (nextda<=250) {
				System.out.println("Transport Done by Lorry");
			}
		}
		else {
			System.out.println("Transport Done by Train");	
		}
		 if (nextIb<100) {
			if (nextda<50) {
				System.out.println("Transport Done by Van");
			}
		}
		else {
			System.out.println("Transport Done by Train");
		} 
	}
	public static void main(String[] args) {
		Urgent();
		Non_Urgent();
		System.out.println("Dispatching...");
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose The case");
		String next = sc.next();
		System.out.println(next);
		switch (next) {
		case "done":
			Urgent();
			break;
		case "DONE":
		Non_Urgent();
		break;
		
		default:
			System.out.println("Invalid data");
			break;
		}
	}
	}


