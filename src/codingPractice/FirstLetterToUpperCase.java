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
	
	public static void transform(String str) {
		String[] arr= str.split(" ");
		String output = "";
		for(int index = 0; index<arr.length; index++) {
			char ch = ' ';
			if(arr[index].charAt(index)!=' '&& arr[index].charAt(index-1)==' ') {
				ch = arr[index].charAt(0);
				char capChar = Character.toUpperCase(ch);
			 //output = output+capChar;
				output  = output+arr[index].replace(ch, capChar)+" ";
			}
		}
		System.out.println(output);
    }
	
	static String convert(String str)
    {
 
        // Create a char array of given String
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
 
            // If first character of a word is found
            if (i == 0 && ch[i] != ' ' || 
                ch[i] != ' ' && ch[i - 1] == ' ') {
 
                // If it is in lower-case
                if (ch[i] >= 'a' && ch[i] <= 'z') {
 
                    // Convert into Upper-case
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }
 
            // If apart from first character
            // Any one is in Upper-case
            else if (ch[i] >= 'A' && ch[i] <= 'Z') 
 
                // Convert into Lower-Case
                ch[i] = (char)(ch[i] + 'a' - 'A');            
        }
 
        // Convert the char array to equivalent String
        String st = new String(ch);
        return st;
    }
	
	public static void main(String[] args) {
		//FirstLetterToUpperCase letterToUpperCase = new FirstLetterToUpperCase();
		transform("i love  908 programming 123");
		//String str = convert("i love  908 programming 123");
		//System.out.println(str);
	}

}
