package codingTest.codingExam8;

/*Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.*/

public class Uniquenumber {
	
	int[] validateArray(int[] arr) {
		int[] output = new int[arr.length];
	//	int max = 0;
		int count = 0;
		for(int index = 0; index<arr.length; index++) {
			boolean flag = false;
			for(int innerIndex = index+1; innerIndex<arr.length; innerIndex++) {
				if(arr[index]==arr[innerIndex]) {
					
					//output[index] = arr[index];
					flag = true;
				}
					
			}
			if(flag==false) {
				if(count<arr.length) {
					output[count] = arr[index];
					count++;
				}
				
			}
		}
		return output;
	}
	
	
	
	public static void main(String[] args) {
		int [] input = {10,2,3,10,3,55,61,2};
		int[] output = new Uniquenumber().validateArray(input);
		for(int index = 0;index<output.length  ;index++) {
			if(output[index]!=0)
				System.out.println(output[index]);
		}
	}

}
