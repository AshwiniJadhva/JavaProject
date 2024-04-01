package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicate {
	
	static void getDuplicateWords(String[] str) {
		List<String> list = Arrays.asList(str);
		ArrayList<String> nameList = new ArrayList<String>();
		for(String word : list) {
			if(list.indexOf(word)!=list.lastIndexOf(word)&&!nameList.contains(word)) {
				System.out.println(word+" is duplicate");
				nameList.add(word);
			}
			else if(!nameList.contains(word)) {
				System.out.println(word+" not dupicate");
				nameList.add(word);
				
			}
		}
		System.out.println(nameList);
	}
	
	static void getDuplicateNum(int[] num) {
		// List<int[]> list = Arrays.asList(num);
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int index = 0; index < num.length; index++) {
			numList.add(num[index]);
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int number : numList) {
			if (numList.indexOf(number) != numList.lastIndexOf(number) && !list.contains(number)) {
				System.out.println(number + " : duplicate");
				list.add(number);
			}
		}

	}
	
	public static void main(String[] args) {
		String[] name = {"ashwini","jadhav","jadhav","ashwini","ghorpade","ghorpade","agstya"};
		getDuplicateWords(name);
		
		int[] arr = {1,2,1,7,4,2,3,4,5,6,7,8,9};
		getDuplicateNum(arr);
	}

}
