package Oops_Concept;

public class Constructor {
	
	public Constructor () {
		this(67);
		System.out.println("Default Constructor");
	}
	
	public Constructor (int a) {
		this("ravi");
		System.out.println("print a= "+a);
	}
	
	public Constructor (String b) {
		this(45,"ravi");
		System.out.println("print b= "+b);
	}
	public Constructor (int a,String b) {
		//this(67);
		System.out.println("print a+b="+b +a);
	}
	
	public static void main(String[] args) {
		Constructor c=new Constructor();
//		Constructor c1=new Constructor(45);
//		Constructor c2=new Constructor("marks");
//		Constructor c3=new Constructor(67,"marks");
		
		
	}

}
