package codingPractice;

/*Test - 5 [ Medium Complexity] : 13th May'2021 

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy*/

public class ReverseString {
	
	String reverseString(String str) {
		String output = "";
		//String input[] = str.split(" ");
		
		for(int index = 0; index<str.length(); index++) {
			output = str.charAt(index)+output;
		}
		return output;
	}
	
	String reverseAllString(String str) {
		String string[] = str.split(" ");
		String output = "";
		for(int index = 0;index<string.length; index++) {
			//char ch = string[index].charAt(index);
			 output = output+ reverseString(string[index])+" ";
			string[index] = output;
		}
		return output.trim();
	}
	
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String output = reverseString.reverseAllString("hi hello how are you");
		System.out.println(output);
		
		
	}

}
