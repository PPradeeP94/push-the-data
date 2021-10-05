package com.password;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Password {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Password");
		String nxt = sc.nextLine();
		System.out.println(nxt);
		
		String repAll = nxt.replaceAll(" +", "(");
		System.out.println(repAll);
		
		String repBall = repAll.replaceAll(("[^a-zA-Z0-9-_]"), "{");
		System.out.println(repBall);
		
		int length = nxt.length();
		System.out.println(length);
		if(nxt.contains("(")&& nxt.contains("{"))
		{
			System.out.println("invalid");
		}
		else if (10<length&50>length) {
			if(repAll.contains("(") || repBall.contains("{")) {
				System.out.println("In Valid Data");
			}
			else {
			System.out.println(" valid data");
			}
		}
		else {
			System.out.println("In valid");	
		}

	}

}
