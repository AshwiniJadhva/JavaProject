package stringAssignmnets.assignmnet20;

/*Assignment 20:  14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

public class Count {
	
	void getCount(String str) {
		
		int digitCount = 0;
		int letterCount = 0;
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int specialCharCount = 0;
		
		for(int index=0; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index))) {
				digitCount++;
			}
			 if(Character.isUpperCase(str.charAt(index))) {
				 upperCaseCount++;
			 }
			if(Character.isLowerCase(str.charAt(index))) {
				lowerCaseCount++;
			}
			if(Character.isLetter(str.charAt(index))) {
				letterCount++;
				
			}
		}
		System.out.println("Total digit count - "+digitCount);
		System.out.println("Total UpperCase Count - "+upperCaseCount);
		System.out.println("Total LowerCase Count - "+lowerCaseCount);
		System.out.println("Total Letter Count - "+letterCount);
	}
	
	public static void main(String[] args) {
		new Count().getCount("1rRpd3F9#K(E");
	}

}
