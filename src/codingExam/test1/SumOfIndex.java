/*
 * Coding Exam - 1 : 18th April 2021

Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */
package codingExam.test1;
public class SumOfIndex {
	void getIndexSum(int arr[], int targetNum) {
		int indexI = 0;
		int indexJ = 0;
		for(int index = 0; index< arr.length; index++) {
			for(int j = 0; j<arr.length;j++) {
				if(arr[index]+arr[j] == targetNum) {
					indexI = j;
					indexJ = index;
				}
			}
		}
		System.out.println(indexI);
		System.out.println(indexJ);
	}
	
	public static void main(String[] args) {
		int arr[] = {2,11,15,7,4};
		new SumOfIndex().getIndexSum(arr, 26);
	}

}
