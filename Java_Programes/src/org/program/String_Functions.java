package org.program;

public class String_Functions {
	
	public static void main(String[] args) {
		String a="Welcome To Chennai";
		String b="Welcome to Chennai";
		System.out.println(a);
		
		int length = a.length();    //18
		System.out.println(length);
		
		boolean equals = a.equals(b);  //true
		System.out.println(equals);
		
		boolean equalsIgnoreCase = a.equalsIgnoreCase(b);  //true
		System.out.println(equalsIgnoreCase);
		
		String upperCase = a.toUpperCase(); //upper
		System.out.println(upperCase);
		
		String lowerCase = a.toLowerCase();  //lower
		System.out.println(lowerCase);
		
		boolean startsWith = a.startsWith("Wel");  //true
		System.out.println(startsWith);
		
		boolean endsWith = a.endsWith("nai");   //true
		System.out.println(endsWith);
		
		boolean contains = a.contains("To");   //true
		System.out.println(contains);
			
		char charAt = a.charAt(5);      //m
		System.out.println(charAt);
		
		String replace = a.replace("To", "2");   //2
		System.out.println(replace); 
		
		String substring = a.substring(1);  //elcome
		System.out.println(substring);
		
		String substring2 = a.substring(1,4);  //elc
		System.out.println(substring2);
		
		boolean empty = a.isEmpty();
		System.out.println(empty);   //false
		
		String trim = a.trim();
		System.out.println(trim);    //Welcome To Chennai
		
		// Unknown Methods
		
		int compareTo = a.compareTo(b);
		System.out.println(compareTo);
		
		String concat = a.concat(b);
		System.out.println(concat);
		
		String[] split = a.split(" ");
		for (String str : split) {
		System.out.println(str);
		}
		char[] charArray = a.toCharArray( );
		for (char c : charArray) {
			System.out.println(c);
		}
		
		int indexOf = a.indexOf("To");         //e
		System.out.println(indexOf);
		
		int lastIndexOf = a.lastIndexOf("nai");  //n
		System.out.println(lastIndexOf);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
