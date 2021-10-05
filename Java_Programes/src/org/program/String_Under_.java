
package org.program;

public class String_Under_ {

	public static void main(String[] args) {
		
	
	String a="welcome to java";
	StringBuilder sb=new StringBuilder(a);
	System.out.println(sb);
	
	StringBuilder append = sb.append(0);
	System.out.println(append);
	
	String replace = a.replace("w", "W");
	System.out.println(replace);
	
	String replace1 = a.replace("t", "T");
	System.out.println(replace1);
	
	String replace2 = a.replace("j", "J");
	System.out.println(replace2);
	
	String replace3 = a.replace("w", "W.");
	System.out.println(replace3);
	
	String join = a.join("w", "_Welcome_To_Java");
	System.out.println(join);
	
	String b=join;
	System.out.println(b);
	
	String format = b.format("welcome", "done");
	System.out.println(format);
	}
}
