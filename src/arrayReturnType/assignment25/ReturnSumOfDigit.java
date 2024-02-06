package arrayReturnType.assignment25;

/*Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4*/


public class ReturnSumOfDigit {
	
	int[] getSumOfDigit(String[] str) {
		int[] SumOutPut = new int[str.length];
		for(int index= 0; index<str.length; index++) {
			int sum = 0;
			for(int innerIndex = 0; innerIndex<str[index].length(); innerIndex++) {
				if(Character.isDigit(str[index].charAt(innerIndex))) {
					sum = sum+(Character.getNumericValue(str[index].charAt(innerIndex)));
				}
					
			}
			SumOutPut[index] = sum;
		}
		return SumOutPut;
	}
	
	public static void main(String[] args) {
		String[] str =  {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3","ashu2ja11dh1av"};
		ReturnSumOfDigit sumOfDigit = new ReturnSumOfDigit();
		int[] OutPutSum = sumOfDigit.getSumOfDigit(str);
		for(int index = 0; index<str.length;index++) {
			System.out.println(OutPutSum[index]);
		}
	}

}
