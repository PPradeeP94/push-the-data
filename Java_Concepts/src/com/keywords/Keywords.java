package com.keywords;

public class Keywords {
	
// Try
// Catch
// Finally
// Throw
// Throws
	
// Final	
// This
// Super	
	
	
// Static block
// Static Method
	
	public static void main(String[] args) {
		try {
			int y []= null;
			int x=5;
			int [] a=  {1,2,3};
			
		//	System.out.println(a[5]);
		//	System.out.println(x/0);
			System.out.println(y[0]);
			
				
		}
		//		 catch (ArrayIndexOutOfBoundsException e) {
//			
//			System.out.println("Out of bound");
//		
//		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException x) {
			System.out.println("Arithmetic");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		finally {
			System.out.println("not resolved");
		}
		
	}
}


// Final,Finally,Finalize