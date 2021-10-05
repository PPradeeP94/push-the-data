package Opps_Concepts;

public class Method_overide_2 extends Method_overide_1{
	
	
	@Override
	public void servicePoint() {
		super.servicePoint();
	}
	
	public void servicePoint(String a) {
		this.servicePoint();
		//System.out.println("ok");
	}
	
	
	@Override
	public void token(int a) {
		super.token(a);
	}
	@Override
	public void service(String b) {
		super.service(b);
	}
	@Override
	public void additional(int a, String b) {
		super.additional(a, b);
	}
	
	public static void main(String[] args) {
		Method_overide_2 mvr = new Method_overide_2();
		mvr.servicePoint();
		mvr.service("bridge");
		mvr.token(32);
		mvr.service("General service");
		mvr.additional(320, "Engine oil");
	}
	


}
