package Opps_Concepts;

public class Method_Over_Ride_2 extends Method_Over_Ride_1{
	
	
	@Override
	public void brand() {
		super.brand();
	}
	@Override
	public void model(String a) {
		super.model(a);
	}
	@Override
	public void rate(int a) {
		super.rate(a);
	}
	@Override
	public void review(int b, String name) {
		super.review(b, name);
	}
	public static void main(String[] args) {
		Method_Over_Ride_2 mor = new Method_Over_Ride_2();
		mor.brand();
		mor.model("oneplusone");
		mor.rate(21000);
		mor.review(2, "good");
	}

	
}

// In two different class
// method name and arguments are;
// method override called as Run-time polymorphism
// method override have same return types


















