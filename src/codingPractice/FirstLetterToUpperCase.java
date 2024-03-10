package codingPractice;

import java.util.Locale;

/*Given a string str, convert the first letter of each word in the string to uppercase. 

Example 1:

Input:
str = "i love programming"
Output: "I Love Programming"
Explanation:
'I', 'L', 'P' are the first letters of 
the three words.*/

public class FirstLetterToUpperCase {
	
	public static void transform(String str)
    {
		String[] arr= str.split(" ");
       for(int index = 0; index<arr.length; index++) {
    	  
       }
    }
	
	public static void main(String[] args) {
		FirstLetterToUpperCase letterToUpperCase = new FirstLetterToUpperCase();
		letterToUpperCase.transform("ashwini jadhav");
	}

}
