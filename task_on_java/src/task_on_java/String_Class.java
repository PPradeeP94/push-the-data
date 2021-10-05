package task_on_java;

public class String_Class {
	
     	
	 public static void main(String[] args) {

			
		 String s="Welcome To Java";
		
	//1
		int l = s.length();
		System.out.println(l);
		
	//2	
		String s1= "Welcome To Java";
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
	//3
		boolean ignoreCase = s.equalsIgnoreCase(s1);
		System.out.println(ignoreCase);
		
    //4
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
	//5	
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
	//6	
		boolean startsWith = s.startsWith("wel");
		System.out.println(startsWith);
		
	//7	
		boolean endsWith = s.endsWith("Java");
		System.out.println(endsWith);
		
	//8	
		boolean contains = s.contains("va");
		System.out.println(contains);
		
	//9	
		int indexOf = s.indexOf("a");
		System.out.println(indexOf);
		
   //10	
		int lastIndexOf = s.lastIndexOf("Java");
		System.out.println(lastIndexOf);
		
   //11	
		char charAt = s.charAt(13);
		System.out.println(charAt);
		
   //12	
	    String replace = s.replace("To", "2");
		System.out.println(replace);
		
   //13
		String substring = s.substring(11);
		System.out.println(substring);
		
   //14	
		String substring2 = s.substring(8, 10);
		System.out.println(substring2);
		
		
   //15	
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
   //16	
		  String s2= "     JAVA java   ";
			String trim = s2.trim();
			System.out.println(trim);
			
	//17		
			String s11="ABC";
			String s22="DEf";
			System.out.println(s11.compareTo(s22));
			
	//18		
			String concat = s11.concat(s22);
			System.out.println(concat);
			
	//19		
			int a=1234;
			String valueOf = String.valueOf(a);
			System.out.println(valueOf);
	//20		
			char[] charArray = s.toCharArray();
			for (char cha : charArray) {
				System.out.println(cha);	
			}
	//21	
			String[] split = s.split(" ");
			for (String str: split) {
				System.out.println(str);	
			}
	//22		
			int cmp = s.compareTo(s1);
			System.out.println();
			System.out.println(cmp);
	//23		
			Class<? extends String> cls = s.getClass();
			System.out.println(cls);
	//24		
			int hashCode = s.hashCode();
			System.out.println(hashCode);
	//25		
			String format = s.format("java", 12,15);
			System.out.println(format);
	//26		
			CharSequence subSequence = s.subSequence(0,15);
			System.out.println(subSequence);
	
		
			String replaceAll = s.replaceAll("Welcome" ,"good");
			System.out.println(replaceAll);
			
			
			
				
			}
		}

			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


