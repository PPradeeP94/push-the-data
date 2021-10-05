package polymorphism;

public class Over_load {
	
	public void carServicePoint() {
		System.out.println("Service Point : Retteri");

	}
	public void carServicePoint(int a) {
		System.out.println("Token No" +"    " +a);

	}
	public void carServicePoint(String c, int d) {
		System.out.println(c+"   "+d);

	}
	public void carService(int a,int b) {
		System.out.println(a+b);

	}
	public void carService(String a,String b) {
		System.out.println(a+b);

	}
	public static void main(String[] args) {
		Over_load ov=new Over_load();
		ov.carServicePoint();
		ov.carServicePoint(99);
		ov.carServicePoint("General Service", 2000);
		ov.carService(1100, 900);
		ov.carService("Done", "Thank You");
	}
}