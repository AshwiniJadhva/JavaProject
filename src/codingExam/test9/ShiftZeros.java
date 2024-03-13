package codingExam.test9;

/*rogramming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]*/

public class ShiftZeros {
	
	int[] processArrya(int[] arr) {
		int[] output = new int[arr.length];
		int count = 0;
		for(int index = 0; index<arr.length; index++) {
			if(arr[index]!=0) {
				output[count] = arr[index];
				count++;
			}
			//else output[index] = arr[index];
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] input = {0,0,1,3,0,3,0,6,0,9,23,45,0};
		int[] output = new ShiftZeros().processArrya(input);
		for(int index= 0; index<output.length; index++) {
			//if(output[index]!=0)
				System.out.print(output[index]+"  ");
		}
	}

}
