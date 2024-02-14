package stringAssignmnets.assignmnet29;



/*Assignment - 29 : 27th April'2021

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)*/

public class ProcessingString {
	
	String strDigit = "";
	int sumEven = 0;
	int sumOdd = 0;
	String uppCase = "";
	String loweCse = "";
	void  validateString(String str) {
		for(int index = 0 ;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index)))
				strDigit = strDigit+str.charAt(index);
			else
				getSum(strDigit);
			
			 if(Character.isLetter(str.charAt(index))) {
				getLetter(str.charAt(index));
			 }
		}
		if (!strDigit.equals("")) {
			getSum(strDigit);
		}
	}
	
	void getSum(String num) {
		if(!num.equals("")) {
			int number = Integer.parseInt(num);
			if (number % 2 == 0) {
				sumEven += number;
			} else
				sumOdd += number;
		}
		strDigit = "";
		
	}
	
	void getLetter(char ch) {
		if(Character.isUpperCase(ch))
			uppCase = uppCase+ch;
		else if(Character.isLowerCase(ch))
			loweCse = loweCse+ch;
			
	}
	
	void displayOutput() {
		String output = sumOdd+uppCase+loweCse+sumEven;
		System.out.println(output);
	}
	
	
	public static void main(String[] args) {
		String input = " F12TT45E6RT5c65c56d7e111";
		ProcessingString processingString = new ProcessingString();
		processingString.validateString(input);
		processingString.displayOutput();
		
	}
}


