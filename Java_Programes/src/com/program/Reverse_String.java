package com.program;

public class Reverse_String {
	
	
	public static void main(String[] args) {

//	        String a="Welcome";
//	        StringBuffer sb=new StringBuffer(a);
//        	StringBuffer reverse = sb.reverse();
//        	System.out.println(reverse);
		
//		   String a="Welcome";
//		   String rev="*";
//		   String rev1="";
//		   int len = a.length();
//		   System.out.println(len);
//		   for (int i = len-1; i >=0; i--) {
//			rev= rev+  a.charAt(i);
//		   }
//		   System.out.println(rev);
		  
		   String a="Welcome";
		   String rev="";
		   char[] array = a.toCharArray();
		   System.out.println(array);
		   int len = array.length;
		   System.out.println(len);
		   for (int i = len-1; i >=0; i--) {
			rev=rev+array[i];
			
		   }
			System.out.println(rev);
		}
		
		
		
	}  	

