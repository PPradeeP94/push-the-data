package com.returntype;

public class Return_Type {
	
//	static int a;
//	static int b;	
//	public static void add() {
//		a=10;
//		b=20;
//		System.out.println(a+b);
//	}
//	
//	public static int add1() {
//		a=14;
//		b=15;
//		return a+b;
//	}
//	public static void main(String[] args) {
//				//System.out.println(add());
//		
//		add();
//		int add1 = add1();
//		System.out.println(add1);
//		}
	
	static int a;
	static String b;
	
	public static void cello() {
		
		a=10;
		b= "pen";

	}
	private static String montex() {
		a=20;
		b= "pen";
		
		return a+b;


	}
	public static void main(String[] args) {
		
		cello();
		System.out.println(a+b);
		
		montex();
		System.out.println(a+b);
		
	}
	
	
	
	
	
	
	
	
	
	
/*
@smoke Test
Scenario: Login Page Deatails

Given: user should launch the site with url
When: user should enter the username in userfiled
And: user should enter the password in passwordfiled
Then: user should click on login button and navigate to search hotel page


@smoke Test
Scenerio: search hotel details

When: user should select location
And: user can select hotel in HotelsField
And: user can select room in roomType
And: user can select no.of numbers
And: user can select chech-in-data for hotelentry
And: user can select chech-out-data for vacating the hotel
And: user can select adult-room
And: user can select child-room
Then: user should click on search button and navigate to select hotel page

	
	
@RunWith(Cucumber.class)
@CucumberOptions (
		
		features = "src\\test\\java\\com\\feature\\Adactin.feature",
		
		glue = "com.definition"	
	//	tags =("~@smokeTest")
		
		)

public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {
		
		driver=Baseclass.getBrowser("chrome");
		
		driver.get("https://adactinhotelapp.com/");
		
	}
	@AfterClass
	public static void tear_Down() {
		
		//driver.close();

	}

}

	

	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	int employeId;
	String employeName;
	double employeSalary;
	

	public int employeeIdInfo() {
		employeId =10;
		return employeId;
	}
	
	public String employeeNameInfo() {
		employeName ="hari";
		return employeName;
	}
	
	public double employeeSalaryInfo() {
		employeSalary =234.56;
		return employeSalary;
	}
	public static void main(String[] args) {
		Return_Type rt= new Return_Type();
		
		System.out.println(rt.employeeIdInfo());
		System.out.println(rt.employeeNameInfo());
		System.out.println(rt.employeeSalaryInfo());
	
	}*/
	/*
	public int getEmployeId() {
		return employeId;
	}
	public String getEmployeName() {
		return employeName;
	}
	public double getEmployeSalary() {
		return employeSalary;
	}
	public static void main(String[] args) {
		Return_Type rt = new Return_Type();
		rt.employeId=121;
		rt.employeName= "hari";
		rt.employeSalary= 2300.09;
		
		System.out.println(rt.getEmployeId());
		System.out.println(rt.getEmployeName());
		System.out.println(rt.getEmployeSalary());
	}
	*/
}
