package Opps_Concepts;

public class Method_Overload {
	




	public void newLaunched() {
		System.out.println("mobile Phone");
	}
	public void newLaunched(String a) {
		System.out.println("mobile :"+a);
	}
	public void newLaunched(int a) {
		System.out.println("mobile Price :"+a);
	}
	public void newLaunched(String b,int a) {
		System.out.println("mobile Phone :"+b+a);
	}
	public int newLaunched(int a, int b) {
		System.out.println("mobile Phone :"+b+"+"+a);
		return a+b;
	}
	public static void main(String[] args) {
		
		 Method_Overload mv = new Method_Overload();
		 mv.newLaunched();
		 mv.newLaunched("oneplus");
		 mv.newLaunched(21000);
		 mv.newLaunched("soldOut", 12345);	
		 mv.newLaunched(2, 3);
	}
	
//	In the class, methods names are same,
//	but aruguments are differents;
	
//	overload method can have different return types
//  method overload called as compile time polymorphism	
	

//  	Based On:
//		     data types;
//	    data type order;
//	    data type count;
	
	
	
	

}
