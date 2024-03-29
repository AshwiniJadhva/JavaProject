package collection.list.codingExam16;

import java.util.HashMap;
import java.util.Set;

/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
*/

public class NumDivby3 {
	static void geNumDivBy3(int[] arr) {
		
		HashMap <Integer, Integer> numDiv = new HashMap <Integer,Integer>();
		
		for(int index = 0; index<arr.length; index++) {
			if(arr[index]%3==0) {
				if(numDiv.containsKey(arr[index])) {
					int count = numDiv.get(arr[index])+1;
					numDiv.put(arr[index],count);
				}
				else {
					numDiv.put(arr[index], 1);
				}
			}
		}
		Set<Integer> keys = numDiv.keySet();
		int max = 0;
		int maxfreqNum = 0;
		for(Integer num : keys) {
			if(numDiv.get(num)>max) {
				max = numDiv.get(num);
				maxfreqNum = num;
			}
		}
		System.out.println(numDiv);
		System.out.println(maxfreqNum+" : "+max);
	}
	public static void main(String[] args) {
		int[] arr = {6,2,6,6,3,6,6,6,4,15,3,3,5,5,12,13,17,12};
		geNumDivBy3(arr);
	}

}
