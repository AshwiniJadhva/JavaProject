package codingPractice;

public class PalindromeString {
	
	void  isPalindrome(String str) {
		String revStr  = "";
		for(int index = 0;index<str.length();index++) {
			revStr = str.charAt(index)+revStr;
		}
		if(revStr.equals(str))
			System.out.println("yes");
		else System.out.println("no");
	}
	
	void validateString(String str) {
		boolean flag = true;
		for(int index = 0, j = str.length()-1;index<=j; index++,j--) {
			if(str.charAt(index)!=str.charAt(j)) {
				flag =false;
				break;
			}
		}
		if(flag)
			System.out.println("yes");
		else System.out.println("no");
	}
	
	public static void main(String[] args) {
		PalindromeString palindromeString =	new PalindromeString();
		//palindromeString.isPalindrome("vgfdetsnkh");
		palindromeString.validateString("abba");
	}

}
