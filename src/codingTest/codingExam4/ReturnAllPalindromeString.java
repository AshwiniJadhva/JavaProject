package codingTest.codingExam4;

/*Programming Test - 4 : 12th May'2021

String input = "Hi MAM hello NamaN techno";
output : MAM NamaN*/

public class ReturnAllPalindromeString {
	
	static int count = 0;
	static String rev = "";
	static String getPalindromestr( String str) {
		//String[] output = new String[str.length];
		
		for(int index = 0; index<str.length(); index++) {
			rev = str.charAt(index)+rev;
			//output[count] = rev;
		}
		if(rev.equals(str))
			return rev;
		else {
			rev = "";
			return rev;
		}
	}
	static String[] getAllPalindromestr(String[] str) {
		String[] output = new String[str.length];
		for(int index = 0; index<str.length; index++) {
			String revStr = getPalindromestr(str[index]);
			if(!rev.equals("")) {
				output[count] = revStr;
				count++;
			}
			
		}
		return output;
	}
	public static void main(String[] args) {
		String[] str = {"aja","Hi","MAM","hello", "NamaN", "techno","ababa"};
		/*
		 * String str1 = "MaM"; String output = getPalindromestr(str1);
		 * System.out.println(output);
		 */
		
		String[] palindromelist = getAllPalindromestr(str);
		for(int index = 0; index<count; index++) {
			System.out.print(palindromelist[index]+" ");
		}
		
	}
}
