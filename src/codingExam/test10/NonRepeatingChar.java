package codingExam.test10;

/*Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g
*/
public class NonRepeatingChar {
	
	void processString(String str) {
		char output = ' ';
		for(int index= 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				output = str.charAt(index);
			}
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		new NonRepeatingChar().processString("abcgbca");
	}

}