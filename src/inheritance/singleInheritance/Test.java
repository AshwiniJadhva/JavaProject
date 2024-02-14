 package inheritance.singleInheritance;

public class Test {
	
	public static void main(String[] args) {
	
		//case : 1
		System.out.println("case  1 : ");
		A a = new A();
		System.out.println(a.x);
		System.out.println(a.y);
		//System.out.println(a.z); CE as class A is parent. cant access child class varible .
		a.m1();
		a.m2();
		//a.m3(); CE as class A is parent. cant access child class methods as m3() is child class method.
		
		//case : 2
		System.out.println("case 2 :  ");
		B b = new B();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
		b.m1();
		b.m2();
		b.m3();
		
		//case : 3
		System.out.println("case 3 : ");
		A a1 = new B();  //dynamic polymorphism.
		System.out.println(a1.x);
		System.out.println(a1.y); //variables are binded at compile time as it alwasy excute parents varible.if child  has same varible. 
		//System.out.println(a.z); //ant access child class varible 
		a1.m1();
		a1.m2(); // behaviour of method will chnage compile time to run time so it execute child class method if both class has equivalent methods
		//a.m3(); CE as m3() is child class method
		
		System.out.println("case 4 : ");
		//case : 4
		//B b1 = new A(); ///CE as A is parent and B is child. as greater size can not fit into smaller size
		//System.out.println(b1.x);
		//System.out.println(b1.y);
		//System.out.println(b1.z);
		//b1.m1();
		//b1.m2();
		//b1.m3();
		
		//case 5 :
		System.out.println("case 5 : ");
		A a2 = new A();
		B b2 = new B();
		a2=b2;// similer to case 3
		System.out.println(a2.x);
		System.out.println(a2.y);
	//	System.out.println(a2.z);CE
		a2.m1();
		a2.m2();
	//	a2.m3(); CE
		
		// case 6:
		System.out.println("case 6: ");
		A a3 = new A();
		A b3 = new B();
		b3 = a3; //similar to case 1.
		System.out.println(a3.x);
		System.out.println(a3.y);
		//System.out.println(a3.z);
		a3.m1();
		a3.m2();
		//a3.m3();
		System.out.println(" calling with b3 - "+b3.x);
		System.out.println("calling on b3 - "+b3.y);
		System.out.print("caaling on b3 - ");
		b3.m1();
		System.out.print("calling on b3 - ");
		b3.m2();
		
		//case 7:
		System.out.println("case 7 : ");
		A a4 = new A();
		B b4 = new B();
		//b4=a4; CE as A is parents n B is child id we want to fits the child at in parnets we need to do typecasting.
		b4 = (B)a4;
		
		
		
	}

}
