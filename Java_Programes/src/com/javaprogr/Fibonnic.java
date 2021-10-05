package com.javaprogr;

public class Fibonnic {
	
	public static void main(String[] args) {
		
		String a= "welcome to java";
		//String y ="_Welcome_To_Java";
		
		String replaceFirst = a.replaceFirst("", "_");
		System.out.println(replaceFirst);
		
		String replaceAll = replaceFirst.replaceAll(" ", "*");
		System.out.println(replaceAll);
		
		
		StringBuffer sb = new StringBuffer(replaceAll);
		  //   System.out.println(sb); 
	//	sb.setCharAt(1, 'W');
		sb.deleteCharAt(1);
		System.out.println(sb);
	}

}
