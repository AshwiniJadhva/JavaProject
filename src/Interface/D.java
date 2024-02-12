package Interface;

public class D extends C implements B{
	public void m4() {
		System.out.println("class D m1()- implemented method of B");
	}
	
	public void m5() {
		System.out.println("class D m5()- implemented method of C");
	}
	
	public static void main(String[] args) {
		D d = new D();
		d.m1();
	}

}
