package codingPractice;

/*Your task is to implement the function strstr. 
  The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. 
  The function returns an integer denoting the first occurrence of the string x in s (0 based indexing).

Example 1:

Input:
s = GeeksForGeeks, x = Fr
Output: -1
Explanation: Fr is not present in the
string GeeksForGeeks as substring.
 

Example 2:

Input:
s = GeeksForGeeks, x = For
Output: 5
Explanation: For is present as substring
in GeeksForGeeks from index 5 (0 based
indexing).*/

public class FindIfSubstringavilableofNot {
	
	void validateString(String s, String x) {
		String  z = "";
		for(int index = 0;index<s.length()-x.length();index++) {
			 if(s.substring(index,s.length()-index).charAt(index)==x.charAt(index))
				 z = z+s.substring(index).charAt(index);
		}
		if(z.equals(x))
			System.out.println("yes");
		else System.out.println("no");
	}
	
	public static void main(String[] args) {
		new FindIfSubstringavilableofNot().validateString("ashwini", "shw");
	}

}
