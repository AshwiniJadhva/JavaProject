package codingPractice;

/*Given a string str. Calculate the total number of unique substrings of the given string.

Input:
abd

Ouput:
6

Explanation:
str = abd. The 6 unique substrings 
are {a, b, d, ab, bd, abd}.*/

public class UniqueSubString {
	
	void processString(String str) {
	 String output = str.substring(0, 2);
	 String output2 = str.substring(0);
	 String output3 = str.substring(1);
	 String output4 = str.substring(2);
	 String output5 = str.substring(1,2);
	 String output6 = str.substring(0, 1);
	 int count = 0;
	 ///int size = str.length();  

	 for(int index = 0;index<str.length();index++) {
		 if(str.substring(index).equals(str))
			 count++;
	 }
	 
	 
	 System.out.println(output+" , "+output2+" , "+output3+" , "+output4+" , "+output5+" , "+output6);
	 System.out.println(count);
	}
	
	public static void main(String[] args) {
		new UniqueSubString().processString("jaja");
		
		
	}

}
