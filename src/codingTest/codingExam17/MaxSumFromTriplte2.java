package codingTest.codingExam17;

import java.util.ArrayList;

/*Test - 17 :
Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17*/

public class MaxSumFromTriplte2 {
	static int MaxSum = 0;
	
	static ArrayList<ArrayList<Integer>> getMaxSumTriplet(int[] arr){
		ArrayList<ArrayList<Integer>> triplet = new ArrayList<ArrayList<Integer>>();
		for(int index = 0 ; index<arr.length-2; index++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int sum = 0;
			sum = arr[index]+arr[index+1]+arr[index+2];
			if(sum>MaxSum) {
				MaxSum = sum;
				list.add(arr[index]);
				list.add(arr[index+1]);
				list.add(arr[index+2]);
				triplet.clear();
				triplet.add(list);
			}
		}
		return triplet;
	}
	
	
	public static void main(String[] args) {
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1,9,8};
		ArrayList<ArrayList<Integer>> ans =getMaxSumTriplet(arr);
		System.out.println(ans+" - >"+MaxSum);
		 
	}

}
