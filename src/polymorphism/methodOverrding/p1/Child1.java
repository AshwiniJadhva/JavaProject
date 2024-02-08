package polymorphism.methodOverrding.p1;

public class Child1 extends Parent{
	
	public void m1() {
		System.out.println("hello");
	}
	
	static void m2() {
		System.out.println("static method cant be override");
	}

}
