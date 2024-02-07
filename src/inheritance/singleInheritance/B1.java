package inheritance.singleInheritance;

public class B1 extends A1{
	
	int x =100;
	
	
	void m2() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.m1(); //10
		b1.m2(); //100
		
		/*
		 * as method travels from parent to child and if there are similar type varible
		 * in both the classes and parent methods using that varible. varibles are
		 * always binded with method at compile time , when we call parent method it
		 * always use parents varible.
		 */
		
	}
	

}
