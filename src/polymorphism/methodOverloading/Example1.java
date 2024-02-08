package polymorphism.methodOverloading;

public class Example1 {
	
	void add(int x , int y) {
		System.out.println(" both int varibles ");
		System.out.println(x+y);
	}
	
	int add(int x , int y, int z) {
		System.out.println("3 int");
		return x+y+z;
	}
	
	void add(int x , double y) {
		System.out.println(" 1st int, 2nd double ");
		System.out.println(x+y);
	}
	
	void add (double x , int  y) {
		System.out.println("1st double , 2nd int");
		System.out.println(x+y);
	}
	
	
	double add(int x, double y, int z) {
		System.out.println("1st int , 2nd double , 3rd int");
		return x+y+z;
	}
	
	void add(double x , double y) {
		System.out.println("both double");
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.add(12, 9);
		example1.add(21,20, 30);
		example1.add(12.9, 10);
		example1.add(10, 30); 
		
		//calling must be accurate as it takes all whole no. as int.
		
	}

}
