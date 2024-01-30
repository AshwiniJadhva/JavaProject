package forloopInsideForloop;

// print 1-5 table

public class Example1 {
	
	void printTables() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i*j);
			}
		}
	}
	
	public static void main(String[] args) {
		new Example1().printTables();
	}

}
