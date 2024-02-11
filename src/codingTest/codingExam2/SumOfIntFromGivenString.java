package codingTest.codingExam2;

/*Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53*/

public class SumOfIntFromGivenString {
	
	void getSumOfInterge(String str) {
		String strDigit = "";
		int sum = 0;
		for(int index= 0 ; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index)))
				strDigit = strDigit+str.charAt(index);
			else if(Character.isLetter(str.charAt(index))) {
				if(!strDigit.equals("")) {
					int num = Integer.parseInt(strDigit);
					sum = sum+num;
				}
				strDigit = "";
				
			}
		}
		if(!strDigit.equals("")) {
			int num = Integer.parseInt(strDigit);
			sum = sum+num;
		}
		  System.out.println("sum is  - "+sum);
	}
	
	public static void main(String[] args) {
		SumOfIntFromGivenString givenString = new SumOfIntFromGivenString();
		String str = "123h14i4w8sdc15";
		givenString.getSumOfInterge(str);
	}

}
