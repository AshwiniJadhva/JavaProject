package polymorphism.methodOverrding.p2;

import polymorphism.methodOverrding.p1.Parent;

public class Child2 extends Parent{
	
	public void m1() {
		System.out.println("access specifier is always equal or wider than parents method then only method can override");
	}

}
