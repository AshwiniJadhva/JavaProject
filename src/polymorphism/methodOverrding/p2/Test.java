package polymorphism.methodOverrding.p2;

import polymorphism.methodOverrding.p1.Parent;

public class Test {
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1(); // hi
		Child2 c2 = new Child2();
		c2.m1();
		Parent p2 = new Child2();
		p2.m1(); // always execute child class method takes garebtee from parents chnage behaviour at run time this is call dynamic polymorphism 
		
	}

}
