package codingTest.codingExam1;

/*CODING EXAM - 1 : 18TH APRIL 2021

Program 1 : 
Given an array of integers nums and an integer target, return index of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
*/
public class ReturnIndexToFindSum {
	
	int[] getIndex(int[] arr, int targetNum ) {
		int[] OutputIndex = new int[2];
		for(int index = 0; index<arr.length; index++) {
			int count = 0;
			for(int innerIndex = 0; innerIndex<arr.length; innerIndex++) {
				if(arr[index]+arr[innerIndex] == targetNum) {
					OutputIndex[count] = innerIndex;
					count++;
					OutputIndex[count] = index;
					break;
				}
			}
		}
		return OutputIndex;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,11,15,7,4};
		ReturnIndexToFindSum findSum =new ReturnIndexToFindSum();
		int[]output = findSum.getIndex(arr, 9);
		for(int index = 0;index<output.length;index++) {
			System.out.println(output[index]);
		}
	}

}
