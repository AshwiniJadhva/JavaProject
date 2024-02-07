package inheritance.singleInheritance.P2;

import inheritance.singleInheritance.P1.A;
import inheritance.singleInheritance.P1.B;

public class Test {
	
	public static void main(String[] args) {
		A a1 = new B();
		//a1.display(); // CE as both are in differnt package
		//a1.m1(); //CE.
		
	}

}
