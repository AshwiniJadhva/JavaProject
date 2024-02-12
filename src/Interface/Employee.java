package Interface;

public  class Employee implements A{
	public void m1() {
		System.out.println("this is A.m1() implemented method");
	}
	
	public void m2() {
		System.out.println("this is A.m2() implemented method");
	}
	
	public  void m3() {
		System.out.println("this is A.m3() implemented method");
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		/*
		 * employee.m1(); employee.m2(); employee.m3();
		 */
		
		A a = new Employee();
		
		a.m2();
		a.m3();
	}
	
}
