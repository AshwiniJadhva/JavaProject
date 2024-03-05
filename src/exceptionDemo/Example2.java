package exceptionDemo;

public class Example2 {
	
	void m1(int y) {
		System.out.println("Hi This is exception example2 - ");
		 int x = 10;
		 try {
			 x = x/y;
		 }
		 catch(ArithmeticException ae) {
			 
		 }catch(IndexOutOfBoundsException aie) {
			 
			} /*
				 * catch(StringIndexOutOfBoundsException se) {
				 * 
				 * }
				 */
		 
	}

}
