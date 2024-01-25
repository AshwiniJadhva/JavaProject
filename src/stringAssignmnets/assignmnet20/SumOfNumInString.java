package stringAssignmnets.assignmnet20;

/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

public class SumOfNumInString {
	
	void getSum(String str) {
		int sum = 0;
		int num = 0;
		for(int index = 0; index<str.length(); index++){
			
			if(Character.isDigit(str.charAt(index))) {
				num = Character.getNumericValue(str.charAt(index));
				System.out.println(num);
				sum = sum+num;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new SumOfNumInString().getSum("J7yu9y8h1h8j4b7j3jjb6");
	}

}
