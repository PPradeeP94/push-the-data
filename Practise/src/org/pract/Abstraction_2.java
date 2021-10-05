package org.pract;

public class Abstraction_2 extends Abstractione {

	@Override
	public void bikeModel() {
		System.out.println("bIkemodel passiom");
		
	}

	@Override
	public void brakeSystem() {
		System.out.println("brakeSystem ABS");
	}
	public static void main(String[] args) {
		Abstraction_2 ab=new Abstraction_2();
		ab.bikeModel();
		ab.brakeSystem();
		ab.companyName();
		ab.speedLimit();
		
	}

}
