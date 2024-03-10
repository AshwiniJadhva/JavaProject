package arrayReturnType.assigmnet26;

/*Assignment - 26 : 19th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r=3ati", "4M4a5d5h1v1i93"}
Output : 1K2omal.
*/

public class ReturnStringWithMinDigit {
	
	
	String getString(String[] arr) {
		String str = "";
		int minCount = arr[0].length();
		for(int index = 0; index<arr.length; index++) {
			int count = 0;
			for(int innerIndex = 0; innerIndex<arr[index].length(); innerIndex++) {
				if(Character.isDigit(arr[index].charAt(innerIndex))) {
					count++;
				}
			}
			
			if(minCount>=count) {
				minCount = count  ;
				str = arr[index]; 
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		String[] str = {"P1u2r2va","1123a" ,"1K2omal","11s", "9S4hivan4i4","k", "1K2r3ati", "4M4a5d5h1v1i93","2as","11a","1u"};
		ReturnStringWithMinDigit minDigit = new ReturnStringWithMinDigit();
		String output = minDigit.getString(str);
		//String output = minDigit.getMinDigitString(str);
		System.out.println(output);
	}

}
