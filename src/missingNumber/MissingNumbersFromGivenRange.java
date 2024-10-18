package missingNumber;

//Find Missing Numbers from given range(sorted/unsordted )

public class MissingNumbersFromGivenRange {
	
	static int count;
	static int[] getMissingNum(int[] arr , int startRange, int endRange) {
		
		int[] missingNum = new int [arr.length];
		
		for(int num = startRange; num<= endRange; num++) {
			boolean isNumberMissing = true;
			for(int index = 0; index<arr.length; index++) {
				if(num==arr[index]) {
					isNumberMissing = false;
					break;
				}
			}
			if(isNumberMissing) {
				missingNum[count] = num;
				count++;
			}
		}
		return missingNum;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,9,1,4,3,6,5};
		int[] output = getMissingNum(arr,1,10);
		for(int index = 0;index<count; index++) {
			System.out.println(output[index]);
		}
	}
}
