package Opps_Concepts;

public class Abstract_Class_2 extends Abstract_Class{

	@Override
	public void engineType() {
		System.out.println("BS6");
	}

	@Override
	protected void Bikecolor() {
		System.out.println("RED");
	}
	
	public static void main(String[] args) {
		Abstract_Class_2 ac = new Abstract_Class_2();
		ac.bike_Model();
		ac.speedLimit();
		ac.brakeSystem();
		ac.engineType();
		ac.Bikecolor();
	}

}
