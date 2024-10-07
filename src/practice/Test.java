package practice;

public class Test {
	
	void m1() throws ArrayIndexOutOfBoundsException {
		System.out.println("hi a");
	}

}
class Testdata extends Test{
	
	void m2() throws IndexOutOfBoundsException {
		System.out.println("Hi b");
	}
	
	public static void main(String[] args) {
		Test t = new Testdata();
		
	}
}
