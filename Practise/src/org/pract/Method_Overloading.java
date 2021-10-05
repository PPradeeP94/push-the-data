package org.pract;

public class Method_Overloading {
	
	public void trainName(String a) {
		System.out.println("print  ="+a);
	}
	public void trainName1(int a) {
		System.out.println("print ="+a);

	}
	public void trainName(int b) {
		System.out.println("print ="+b);
	}
	public void trainName(int a,String b) {
		System.out.println(b+a);

	}
	public static void main(String[] args) {
		Method_Overloading mo=new Method_Overloading();
		mo.trainName("Howrah");
		mo.trainName1(12345);
		mo.trainName(20);
		mo.trainName(3, "2a");
		
	}



	

}
