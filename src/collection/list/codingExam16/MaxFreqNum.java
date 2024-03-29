package collection.list.codingExam16;

import java.util.HashMap;
import java.util.Set;

/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

public class MaxFreqNum {
	
	static int getMaxFreqNum(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int index = 0 ; index<arr.length; index++) {
			if(hm.containsKey(arr[index])) {
				int count = hm.get(arr[index])+1;
				hm.put(arr[index], count);
			}
			else {
				hm.put(arr[index], 1);
			}
		}
		Set<Integer> keys = hm.keySet();
		int maxFreqNum = 0;
		int max = 0;
		for(Integer maxNum : keys) {
			if(max<hm.get(maxNum)) {
				max = hm.get(maxNum);
				maxFreqNum = maxNum;
			}
		}
		return maxFreqNum;
	}
	public static void main(String[] args) {
		int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
		int maxNumber = getMaxFreqNum(arr);
		System.out.println(maxNumber);
	}

}
