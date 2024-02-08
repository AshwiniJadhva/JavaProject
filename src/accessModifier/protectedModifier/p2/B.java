package accessModifier.protectedModifier.p2;

import accessModifier.protectedModifier.p1.A;

public class B extends A{
	
	void display() {
		System.out.println(y);
	}
	public static void main(String[] args) {
		
		A a = new A();
		
		
		//	a.m1(); CE as m2() of class A is default cant go outside of the package.
		
		// System.out.println(a.y); CE
		/*
		 * y is protected member of class A is comes in class B
		 * in protected form . so to access protected members of parents class we have
		 * to create object of chile class. on the refrance we can access protected
		 * member of parent class
		 */	
		B b = new B();
		
		System.out.println(b.y); //20
		b.m2();
	}
	

}
