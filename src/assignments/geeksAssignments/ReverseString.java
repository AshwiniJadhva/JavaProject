package assignments.geeksAssignments;
/*
 * String Reverse
 */
public class ReverseString {
	
	void getStrReverse(String str) {
		String revStr ="";
		char ch;
		for(int index=0; index<str.length(); index++) {
			ch = str.charAt(index);
			revStr = ch+revStr;
		}
		System.out.println(revStr);
	}
	
	public static void main(String[] args) {
		new ReverseString().getStrReverse("Ashwini jadhav");
	}

}
