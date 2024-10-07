package practice;

public class ConsrtuctorOverloading {
	int x;
	public ConsrtuctorOverloading() {
		x =5;
	}
	public ConsrtuctorOverloading(int val) {
		x=val;
	}
	public static void main(String[] args) {
		ConsrtuctorOverloading obj1 = new ConsrtuctorOverloading();
		ConsrtuctorOverloading obj2 = new ConsrtuctorOverloading(10);
		System.out.println(obj1.x + ", " + obj2.x);
	}

}
