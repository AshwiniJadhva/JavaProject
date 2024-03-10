package codingPractice;

/*Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. The function returns an integer denoting the first occurrence of the string x in s (0 based indexing).

Note: You are not allowed to use inbuilt function.

 

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


public class CheckStringEquality {
	
	int validateString(String str , String x) {
		int output = -1;
		//char ch = x.charAt(0);
		for(int index = 0; index<str.length();index++) {
			if(str.contains(x)) {
				 output = str.indexOf(x);
				
			}
				
		}
		return output;
	}
	
	public static void main(String[] args) {
		int output = new CheckStringEquality().validateString("GeeksForGeeks", "For");
		System.out.println(output);
	}

}
