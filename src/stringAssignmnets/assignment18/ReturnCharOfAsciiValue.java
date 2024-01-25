package stringAssignmnets.assignment18;

/*Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)*/


public class ReturnCharOfAsciiValue {
	
	char getAsciiOfChar(int asciiValue) {
		
		char ch = (char)asciiValue;
		return ch;
	}
	
	public static void main(String[] args) {
		ReturnCharOfAsciiValue returnCharOfAsciiValue  = new ReturnCharOfAsciiValue();
		int ch = 76;
		char chValue = returnCharOfAsciiValue.getAsciiOfChar(ch);
		System.out.println("Ascii value of given char - "+ch+" is - "+chValue);
	}

}
