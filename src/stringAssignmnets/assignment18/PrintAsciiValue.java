package stringAssignmnets.assignment18;

/*Program 3:  write a method which will print ascii value of A to Z.*/

public class PrintAsciiValue {
	
	void getAsciiValue(char start, char end) {
		for(int index = start; index<=end; index++) {
			System.out.println(index);
		}
	}
	
	public static void main(String[] args) {
		new PrintAsciiValue().getAsciiValue('0', '9');
	}

}
