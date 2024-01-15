package loopDemo;

public class Example1 {
	public static void main(String[] args) {
		for(int i =0; i<3;i++) {
			int count = 0;
			for(int j=i;j<3;j++) {
				count++;
			}
			System.out.println(count);
		}
	}

}
