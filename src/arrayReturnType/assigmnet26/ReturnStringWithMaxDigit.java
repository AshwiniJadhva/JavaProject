package arrayReturnType.assigmnet26;

/*Assignment - 26 : 19th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r=3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
*/

public class ReturnStringWithMaxDigit {
	
	int getCount(String str) {
		int count = 0;
		String output = "";
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
				count++;
				output = str;
			}
		}
		return count;
	}

	
	String getStringWithMaxDigit(String[] arr) {
		String outputstr = "";
		int maxCount = 0;
		for(int index = 0;index<arr.length;index++) {
			int countDigit = 0;
			for(int innerIndex = 0; innerIndex<arr[index].length();innerIndex++) {
				if(Character.isDigit(arr[index].charAt(innerIndex))) {
					countDigit++;
				}
			}	
			if(countDigit>maxCount) {
				outputstr = arr[index];
				maxCount = countDigit;
			}
		}
		return outputstr;
		
	  }

	public static void main(String[] args) {
		String[] inputStr = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r=3ati", "4M4a5d5h1v1i93","12345as2121231" };
		ReturnStringWithMaxDigit maxDigit = new ReturnStringWithMaxDigit();
		// maxDigit.validateStringWithMaxDigit(str);
		String outStr = maxDigit.getStringWithMaxDigit(inputStr);
		System.out.println(outStr);
		
	}
}
