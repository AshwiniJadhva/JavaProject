package inheritance.multilevelnheritance;

public class C extends B{
	
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.x);
		System.out.println(c.z);
		c.m2();
		System.out.println(c.m2());
		c.m2(3);
	}

}
