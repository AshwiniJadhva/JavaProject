package arrayReturnType.assignment25;

/*Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/

public class ReturnStringwithDigit {
	
	int outPutStrIndex = 0;
	
	String[] getStringwithDigit(String[] arr) {
		String[] outPutStr = new String[arr.length];
		for(int index = 0; index<arr.length; index++) {
			for(int innerIndex = 0 ; innerIndex<arr[index].length();innerIndex++) {
				if(Character.isDigit(arr[index].charAt(innerIndex))) {
					outPutStr[outPutStrIndex]=arr[index];
					outPutStrIndex++;
					break;
				}
			}	
		}
		return outPutStr;
	}
	
	public static void main(String[] args) {
		ReturnStringwithDigit digit = new ReturnStringwithDigit();
		String[] arr = {"hi1","ajinkya123","TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25","ashu7890","bye"};
		String[] output = digit.getStringwithDigit(arr);
		for(int index = 0; index<digit.outPutStrIndex;index++) {
			System.out.println(output[index]);
		}
	}

}
