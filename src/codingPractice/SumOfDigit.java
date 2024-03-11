package codingPractice;

/*Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53*/

public class SumOfDigit {
	void getSumOfAllDigit(String str) {
		int sum = 0;
		String digit = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				digit = digit + str.charAt(index);
			else if (Character.isLetter(ch)) {
				if (!digit.equals("")) {
					int num = Integer.parseInt(digit);
					sum = sum + num;
				}
				digit = "";

			}
		}

		
		if (!digit.equals("")) {
			int num = Integer.parseInt(digit);
			sum = sum + num;
		}

		System.out.println("sum is  - " + sum);
	}
	public static void main(String[] args) {
		new SumOfDigit().getSumOfAllDigit("a12h14i4w8sdc15");
	}

}
