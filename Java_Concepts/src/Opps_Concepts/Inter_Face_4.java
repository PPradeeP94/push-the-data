package Opps_Concepts;

public class Inter_Face_4 implements Inter_Face_1,Inter_Face2,Inter_Face_3 {

	@Override
	public void productPriceList() {
	}

	@Override
	public void productComboOffer() {
	}

	@Override
	public void productQuality() {
	}

	@Override
	public void productCondition() {
	}

	@Override
	public void productReview() {
	}

	@Override
	public void ProductDemo() {
		System.out.println("Demo");
	}

	@Override
	public void productDesign() {
		System.out.println("Design..Process");
	}

	@Override
	public void productCatalog() {
		System.out.println("Catalog Prepared");
	}
	public static void main(String[] args) {
		Inter_Face_4 icf = new Inter_Face_4();
		icf.ProductDemo();
		icf.productDesign();
		icf.productCatalog();
	}

}
//  It supports only abstract method
//  we wont create an obj for interface
//  becoz there is no impelements part
//  To access interface we have use implements keyword
//  It supports multiple inheritances
//  public abstract is default here