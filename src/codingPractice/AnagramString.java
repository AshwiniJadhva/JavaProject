package codingPractice;

import java.util.Arrays;

/*Given two strings S1 and S2 . Print "1" if both strings are anagrams otherwise print "0" .

Note: An anagram of a string is another string with exactly the same quantity of each character in it, in any order.

Example 1:

Input: S1 = "cdbkdub" , S2 = "dsbkcsdn"
Output: 0 
Explanation: Length of S1 is not same
as length of S2.
Example 2:

Input: S1 = "geeks" , S2 = "skgee"
Output: 1
Explanation: S1 has the same quantity 
of each character in it as S2.
*/


public class AnagramString {
	
	
	void anagramString(String str1, String str2) {
		//String s1 = str1.replaceAll("\\s", "");  
		//String s2 = str2.replaceAll("\\s", "");  
		
		boolean status = true;
		if (str1.length() != str2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = str1.toLowerCase().toCharArray();
			char[] ArrayS2 = str2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
		
		 
    }  
	
	public static void main(String[] args) {
		AnagramString anagramString =  new AnagramString();
		//anagramString.validateString("abc", "bca");
		anagramString.anagramString("peek", "pEek");
	}

}
