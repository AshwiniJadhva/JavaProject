package collection.list.codingExam16;

import java.util.HashMap;

/*Test - 16 : 
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2,12,1,12};
*/

public class FrequencyOfNum {
	
	static void getFreqOfDigit(int[] arr) {
		HashMap<Integer, Integer> freqOfDigit = new HashMap<Integer, Integer>();
		
		for(int index = 0; index<arr.length; index++) {
			int digit = arr[index];
			if(freqOfDigit.containsKey(digit)) {
				int count = freqOfDigit.get(digit)+1;
				freqOfDigit.put(digit, count);
			}
			else {
				freqOfDigit.put(digit, 1);
			}
		}
		System.out.println(freqOfDigit);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2,9,12,12};
		getFreqOfDigit(arr);
	}

}
