package collection.list.codingexam12;

/*Programming Test - 12 : 22nd May'2021

1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15*/

import java.util.ArrayList;

public class NumberDevideBy3And5 {
	
	ArrayList<Integer> validateArrayList(ArrayList<Integer> numList){
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for(int index = 0;index<numList.size();index++) {
			 int num = numList.get(index);
			if(num%3==0 || num%5==0 || num%3==0 && num%5==0) {
				outputList.add(num);
			}
		}
		return outputList;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(2);
		numList.add(3);
		numList.add(6);
		numList.add(15);
		numList.add(44);
		numList.add(32);
		numList.add(9);
		numList.add(20);
		numList.add(8);
		
		NumberDevideBy3And5 devideBy3And5 = new NumberDevideBy3And5();
		ArrayList<Integer> outputNum = devideBy3And5.validateArrayList(numList);
		System.out.println(outputNum);
	}

}
