package codingPractice;

/*Given a string str of lowercase alphabets. The task is to find the maximum occurring character in the string str. If more than one character occurs the maximum number of time then print the lexicographically smaller character.

Example 1:

Input:
str = testsample
Output: e
Explanation: e is the character which
is having the highest frequency.
Example 2:

Input:
str = output
Output: t
Explanation:  t and u are the characters
with the same frequency, but t is
lexicographically smaller.
*/
public class RetrunMaxChar {
	
	public static char getMaxOccuringChar(String line)
    {
		char maxFreqChar = '\0';
		int maxCount = 0;
        for(int index = 0; index<line.length(); index++){
            int count = 0;
            
            for(int innerIndex = 0; innerIndex<line.length(); innerIndex++){
            	if(line.charAt(index)==line.charAt(innerIndex))
                count++;
            }
            if(maxCount<count){
                maxCount = count;
                maxFreqChar = line.charAt(index);
            }
        }
        return maxFreqChar;
            
    }
	
	public static void main(String[] args) {
		char ch = RetrunMaxChar.getMaxOccuringChar("kkkkkkkkkkkkkkkkk globant mmmmmmmmmmmmmmmmmmmmmmmmmmm is hiring aaaaa");
		System.out.println(ch);
	}

}
