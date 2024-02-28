package codingPractice;


/*Given a string str, convert the first letter of each word in the string to uppercase. 

Example 1:

Input:
str = "i love programming"
Output: "I Love Programming"
Explanation:
'I', 'L', 'P' are the first letters of 
the three words.*/

public class FirstLetterToUpperCase {
	
	public static String transform(String s)
    {
        // code here
        String output = "";
        for(int index = 0;index<s.length();index++){
         
            char ch = Character.toUpperCase(s.charAt(index));
            output = output+ch;
           
               
            
        }
        return output;
    }
	
	public static void main(String[] args) {
		String output= FirstLetterToUpperCase.transform("ashwini jadhav");
		System.out.println(output);
	}

}
