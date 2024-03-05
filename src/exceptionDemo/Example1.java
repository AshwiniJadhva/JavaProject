package exceptionDemo;

public class Example1 {
	
	void m1(int y) {
		System.out.println("hi");
		System.out.print("answer is - ");
		
		int x = 10;
		try {
			x = x/y;
		}catch(ArithmeticException ae) {
			
			String msg = ae.getMessage();
			System.out.println(x);
			System.out.println(msg);
		}
	}
	
	public static void main(String[] args) {
		new Example1().m1(0);
	}

}
