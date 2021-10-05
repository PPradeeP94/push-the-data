package org.program;

public class Append_String {
	
	public static void main(String[] args) {
		
		String a="welcome to world";
		
		String[] split = a.split(" ");
		for (String str : split) {			
		StringBuffer sb=new StringBuffer(str);
		StringBuffer append = sb.insert(0, "_");
		System.out.println(append);
		
		}
	}
}
