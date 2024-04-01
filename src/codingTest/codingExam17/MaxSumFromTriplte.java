package codingTest.codingExam17;

import java.util.ArrayList;

/*Test - 17 :
Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15*/

public class MaxSumFromTriplte {
	
	static void getSum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length-2; index = index + 3) {
			sum = arr[index] + arr[index+1]+arr[index+2];
		}
		System.out.println(sum);
	}
	
	static ArrayList<ArrayList<Integer>> getMaxSumTriplet(int[] arr){
		 int sum=0;
		
		ArrayList<ArrayList<Integer>> tripletsum = new ArrayList<ArrayList<Integer>>();
		for(int index = 0; index<arr.length-2; index = index+3) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int add = 0;
			add = arr[index]+arr[index+1]+arr[index+2];
			if(sum<add) {
				sum = add;
				list.add(arr[index]);
				list.add(arr[index+1]);
				list.add(arr[index+2]);
				tripletsum.clear();
				tripletsum.add(list);
				
			}
		}
		return tripletsum;
	}
	
	
	public static void main(String[] args) {
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1,9,8};
		 getSum(arr);
		ArrayList<ArrayList<Integer>> answer = getMaxSumTriplet(arr);
		System.out.println(answer);
		 
	}

}
