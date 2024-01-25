package stringAssignmnets.assignment18;

/*Assignment 18 : 14th April'2021
Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)*/

public class ReturnASCIIValue {
	
	int getAsciiOfChar(char ch) {
		int aciiValue = ch;
		return aciiValue;
	
	}
	
	public static void main(String[] args) {
		ReturnASCIIValue asciiValue = new ReturnASCIIValue();
		int aciiValue = asciiValue.getAsciiOfChar('A');
		System.out.println(" Ascii value of A is - "+aciiValue);
	}

}
