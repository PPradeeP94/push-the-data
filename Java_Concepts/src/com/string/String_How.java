package com.string;

public class String_How {

	public static void main(String[] args) {

		String a = "java";

		String b = "java";

		String c;

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

		c = a + b;
		System.out.println(System.identityHashCode(c));
		
		StringBuffer sb = new StringBuffer("java");
		
		StringBuffer sb1 = new StringBuffer("java1");

		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(sb1));

		sb.append(sb1);
		System.out.println(sb);
		
		System.out.println(System.identityHashCode(sb));

	}

}
