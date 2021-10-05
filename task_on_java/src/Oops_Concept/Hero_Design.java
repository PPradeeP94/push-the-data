package Oops_Concept;

public class Hero_Design extends Hero_Bike {

	@Override
	public void speedLimit() {
		System.out.println("120");
	}

	@Override
	public void bikeColor() {
		System.out.println("black,red"
				+ "");
	}
	public static void main(String[] args) {
		Hero_Design hd=new Hero_Design();
		hd.Company();
		hd.bike_name();
		hd.engineType();
		hd.speedLimit();
		hd.bikeColor();
	}
	

}
