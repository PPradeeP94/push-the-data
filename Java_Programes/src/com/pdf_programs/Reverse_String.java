package com.pdf_programs;

public class Reverse_String {

	
	public static void main(String[] args) {
		
		String a= "welcome";
		
		String rev= "";
		
		for (int i = a.length()-1; i>=0; i--) {
			
			rev=rev+a.charAt(i);
		}	
			System.out.println(rev);
//---------------------------------------------------------------
			
			String b= "done";
			
			String reve="";
			
			char[] charArray = b.toCharArray();
			int length = charArray.length;
			
			for (int i = length-1; i>=0; i--) {
				reve=reve+charArray[i];
			}
			System.out.println(reve);
//--------------------------------------------------------------------------------
			String c= "java";
			
			StringBuffer sb = new StringBuffer(c);
		//	sb.append(c);
			sb.reverse();
			System.out.println(sb);
	}
}
