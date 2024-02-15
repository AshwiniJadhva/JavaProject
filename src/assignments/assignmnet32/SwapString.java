package assignments.assignmnet32;

/*Assignment - 32 : 4th May'2021

program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"

program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"

Hint : you can use subString method.
*/

public class SwapString {
	
	void swap1(String input1 , String input2) {
		String temp = input1;
		input1=input2;
		input2=temp;
		System.out.println("input1 = "+input1+" input2 = "+input2);
	}
	
	void swap2(String input1, String input2) {
		input1= input1+input2;
		input2= input1.substring(0, input1.length()-input2.length());
		input1=input1.substring(input2.length());
		System.out.println("input1 = "+input1+" input2 = "+input2);
	}
	
	public static void main(String[] args) {
		SwapString swapString = new SwapString();
		swapString.swap1("Techno", "credits");
		swapString.swap2("Ashwini", "Ajinkya");
	}

}
