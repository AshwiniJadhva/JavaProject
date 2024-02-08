package polymorphism.methodOverloading;

public class Test {
	
	void m1(byte b) {
		System.out.println("1");
	}
	
	void m1(short s) {
		System.out.println("2");
	}
	
	/*
	 * void m1(int x) { System.out.println("4"); }
	 */
	/*
	 * void m1(long l) { System.out.println("5"); }
	 */
	
	/*
	 * void m1(float f) { System.out.println("6"); }
	 */
	/*
	 * void m1(double d) { System.out.println("8"); }
	 */
	
	public static void main(String[] args) {
		Test test = new Test();
		//test.m1(byte(10);
	}

}
