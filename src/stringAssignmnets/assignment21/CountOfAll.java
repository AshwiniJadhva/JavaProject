package stringAssignmnets.assignment21;

/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
Note : without using charctor class method
*/
public class CountOfAll {
	
	void getCount(String str) {
		int digitCount = 0;
		//int lettersCount = 0;
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int specialCharCount = 0;
		for(int index =0; index<str.length(); index++) {
			if((str.charAt(index)>='0' )&& (str.charAt(index)<='9'))
				digitCount++;
			else if((str.charAt(index)>='A') && (str.charAt(index)<='Z'))
				upperCaseCount++;
			else if((str.charAt(index)>='a') && (str.charAt(index)<='z'))
				lowerCaseCount++;
			else specialCharCount++;
		}
		System.out.println("Total Digit Count - "+digitCount);
		System.out.println("Total letters count  - "+(lowerCaseCount+upperCaseCount));
		System.out.println("Total upperCase count - "+upperCaseCount);
		System.out.println("Total lowercase count - "+lowerCaseCount);
		System.out.println("Total sepcial cahr cout  - "+specialCharCount);
	}
	
	public static void main(String[] args) {
		new CountOfAll().getCount("1rRpd3F9#K(E");
	}

}
