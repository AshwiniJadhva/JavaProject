package assignments.assignmnet31;

/*Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation.
*/
public class Swapping {
	int x; int y;
	int z = 0;
	
	void swap1(int x1 ,int y1) {
		this.x=y1;
		this.y=x1;
		
		if(x == x1)
			z=x1;
		if(y==y1) {
			x = y1;
			y=z;
		}
		System.out.println("x : "+x+" y : "+y);
	}
	
	void swap2(int x,int y) {
		int temp = x;
		x=y;
		y=temp;
		System.out.println("x : "+x+" y : "+y);

	}
	
	void swap3(int x, int y ) {
		x = x+y;
		y = x-y;
		x = x -y;
		System.out.println("x : "+x+" y : "+y);

	}
	public static void main(String[] args) {
		Swapping swapping = new Swapping();
		swapping.swap1(200, 20);
		swapping.swap2(10, 20);
		swapping.swap3(40, 50);
	}

}
