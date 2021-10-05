package Oops_Concept;

public class Calc {
	//default constructur
	int num;
	int num1;
	int num2;
	String c;
	public  Calc() {
		System.out.println("Default ");
	}
	public  Calc(int a,int b) {
		int num=5;
		int num1=12;
		int num2;
		System.out.println("Parameterised: "+num+"+"+num1+"="+(num+num1));
		System.out.println(b+"+"+a);
	}
	public  Calc(double d) {
		num2=(int)d;
		System.out.println(num2);
	}
	public Calc (String c) {
	 String c1 = c;
	System.out.println(c1);
	
	}
	
	public static void main(String[] args) {
		Calc c=new Calc();
		Calc cc=new Calc(4,7);
		Calc cc1=new Calc(7.5);
		Calc cc2=new Calc("HARi");
	}


}
