package stringAssignmnets.assignmnet19;

/*Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count,
 otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits*/

public class UpperCaseLowerCaseCount {
	
	String getCount(String str) {
		int upperCount =0;
		int lowerCount = 0;
		for(int index=0; index<str.length(); index++) {
			str.charAt(index);
			if(Character.isUpperCase(str.charAt(index)))
				upperCount++;
			else lowerCount++;
		}
		if(upperCount>lowerCount)
			return "Techno";
		else return "Credits";
	}
	
	public static void main(String[] args) {
		UpperCaseLowerCaseCount upperCaseLowerCaseCount= new UpperCaseLowerCaseCount();
		String str = upperCaseLowerCaseCount.getCount("TeCHnoSessionS");
		System.out.println(str);
	}

}
