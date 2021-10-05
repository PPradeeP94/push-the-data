package org.variables;

public class Variables {
	
	int b=20; //class var
	public void add() {
		int a=10; //local var
		System.out.println(a);

	}
	public void multi() {
		System.out.println(b);
	}
	public static void main(String[] args) {
		Variables var=new Variables();
		var.add();
	//	var.multi();
		System.out.println(var.b);
	}

}
