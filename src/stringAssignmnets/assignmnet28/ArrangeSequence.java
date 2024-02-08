package stringAssignmnets.assignmnet28;

/*Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis*/

public class ArrangeSequence {
	
	String processString(String str) {
		String digitstr = "";
		String upperCaseStr = "";
		String lowerCaseStr = "";
		String outputStr = "";
		for(int index = 0 ; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index)))
				digitstr = digitstr+str.charAt(index);
			else if(Character.isUpperCase(str.charAt(index)))
				upperCaseStr = upperCaseStr+str.charAt(index);
			else if(Character.isLowerCase(str.charAt(index)))
				lowerCaseStr = lowerCaseStr+str.charAt(index);
		}
		outputStr = digitstr+upperCaseStr+lowerCaseStr;
		return outputStr;
	}
	
	String[] processStrArray(String[] str) {
		String[] output = new String[str.length];
		for(int index = 0 ; index<str.length; index++) {
			output[index]= processString(str[index]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		ArrangeSequence sequence = new ArrangeSequence();
		
		String input = "Te1Ch2noCr4e_%$d8iTs9";
		String output = sequence.processString(input);
		System.out.println(output);
		
		String[] str = {"Te1Ch2noCr4e_%$d8iTs9", "Ashu214JadhavG","Ajink7890GhorPade"};
		 String outputstr []= sequence.processStrArray(str);
		for(int index= 0 ;index<outputstr.length;index++) {
			System.out.println(outputstr[index]);
		}
		
		
	}

}
