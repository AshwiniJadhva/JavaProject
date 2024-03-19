package codingTest.codingExam5;

/*Test - 5 [ Medium Complexity] : 13th May'2021 

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy
*/

public class ReverseEachWord {
	
	static String reverseStr(String str) {

		String rev = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			rev = ch + rev;

		}

		return rev;
	}
	
	static String revStr(String str) {
		String[] input = str.split(" ");
		String output = "";
		for(int index = 0; index<input.length; index++) {
			output = output + reverseStr(input[index])+" ";
		}
		return output.trim();
	}

	public static void main(String[] args) {
		String str = "hi hello how are you";
		String output = reverseStr(str);
		System.out.println(output);
		String rev  = revStr(str);
		System.out.println(rev);
	}

}
