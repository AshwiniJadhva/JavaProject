package practice;

public class B extends A{
	void m1() throws IndexOutOfBoundsException{
		System.out.println("Hi B");
	}
	public static void main(String[] args) {
		//A a = new B();
		//System.out.println(a.x);
		 
	        A a =new B();
	        a.m1();
	        B b = new B();
	        b.test();
	}
	
	void test() {
		int arr[] = {7,4,3,2,5,6};
		int temp = 0;
		for(int index = 0; index<arr.length; index++) {
			int flag = 0;
			temp = arr[index]*arr[index]*arr[index];
			if(temp>50) {
				flag = arr[index];
			}
			System.out.println(flag);
		}
		String str = "123abc23bgi";
	}

}
