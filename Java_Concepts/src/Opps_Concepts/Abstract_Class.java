package Opps_Concepts;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public  abstract class Abstract_Class {
	
	public void bike_Model() {
		System.out.println("passion pro");
	}
	public final void speedLimit() {
		System.out.println("120km/hr");
	}
	public void brakeSystem() {
		System.out.println("abs Brake system");
	}
	public  abstract  void engineType();
	 
	 protected abstract void Bikecolor();
	 
}


// it support both abstract And non-Abstract method
// we have mention ABSTRACT keyword in abstract class
// There is no implementation part 
// we wont create an object for abstract class
// To access abstract class we have to use extends keyword
// Here,public abstract keyword is mandtotry
// In abstract method we cannot use static,final keywords
// Abstract class doesnot support mutliple inheritance