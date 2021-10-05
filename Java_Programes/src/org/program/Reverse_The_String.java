package org.program;

public class Reverse_The_String {
	
	public static void main(String[] args) {
		
	/*	String a="welcome";
		StringBuffer sb=new StringBuffer(a);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse); */
		
	/*	String b="welcome";
		String rev="";
		
		int length = b.length();
		System.out.println(length);
		for (int i = length-1; i>=0; i--) {
		char charAt = b.charAt(i);
		rev=rev+charAt;
		}
		System.out.println(rev); */
		
		
		String c="welcome";
		String rev="";
		char[] array = c.toCharArray();
		int length = array.length;
		for (int i = length-1; i >=0; i--) {
			rev=rev+array[i];	
		}
		System.out.println(rev);

}
}
