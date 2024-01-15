package codingExam.test1;

public class Test2 {
	protected void m1() {
		System.out.println("A");
		m2();
	}
	protected void m2() {
		System.out.println("B");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Test2  test2 =  new Test2();
	test2.m1();

	}

}
class Dervied extends Test2{
	protected void m1() {
		System.out.println("C");
	}
	public void m2() {
		System.out.println("D");
	}
}