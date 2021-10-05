package Oops_Concept;

public class Nokia  extends Oppo{
	@Override
	public void china() {
		super.china();
	}
	@Override
	public void display(String a) {
		super.display(a);
	}
	@Override
	public void camera(int a) {
		super.camera(a);
	}
	@Override
	public void price(String a) {
		super.price(a);
	}
	@Override
	public void review(String b) {
		super.review(b);
	}
	public static void main(String[] args) {
		Nokia n=new Nokia();
		n.china();
		n.display("gorolia");
    	n.camera(48);
		n.price("20000");
     	n.review("good");
	}
}