package assignments.geeksAssignments;

/*Given a string S. The task is to convert characters of string to lowercase.

Input: S = "ABCddE"
Output: "abcdde"
Explanation: A, B, C and E are converted to
a, b, c and E thus all uppercase characters 
of the string converted to lowercase letter.

Your Task:  
You dont need to read input or print anything. Complete the function toLower() which takes S as input parameter and returns the converted string.

Expected Time Complexity:O(n)
Expected Auxiliary Space: O(1) 

*/


public class CovestToLowerCase {
	
	String toLowerCase(String str) {
		String lowerCaseStr = "" ;
		for(int index =0; index<str.length(); index++) {
			char ch =  Character.toLowerCase(str.charAt(index));
			
			lowerCaseStr = lowerCaseStr+ch;
		}
		return lowerCaseStr;
	}
	
	void getLowerStr(String str) {
		str = str.toLowerCase();
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		CovestToLowerCase  covestToLowerCase =new CovestToLowerCase();
		String str =  covestToLowerCase.toLowerCase("AshwINI");
		System.out.println(str);
		
		covestToLowerCase.getLowerStr("AJINKY");
	}
}
