package inheritance.singleInheritance;

public class A {
	
	int x = 10;
	int y = 12;

	void m1() {
		System.out.println(" A m1() method");
	
	}
	
	void m2() {
		System.out.println("A m2() method");
	}
}

class B extends A{
	int y =30;
	int z = 40;
	
	void m2() {
		System.out.println(" B m2() method ");
	}
	
	void m3() {
		System.out.println(" B m3() method ");
	}
}
