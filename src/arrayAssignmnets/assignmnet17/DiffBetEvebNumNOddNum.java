package arrayAssignmnets.assignmnet17;

/*Program 2:  return a difference between sum of even number and odd numbers.	
		From given numbers, count the odd and even numbers.
		input : 10,23,26,27,88,87,65 
	    output : evenSum - oddSum
		
		int getDifference(int[] input){
		
		}*/

public class DiffBetEvebNumNOddNum {
	
	int getDiffBetEvnOdd(int[] input) {
		int evenSum = 0;
		int oddSum = 0;
		for(int index=0; index<input.length; index++) {
			if(input[index]%2==0) 
				evenSum = evenSum + input[index];
			
			else
				oddSum = oddSum + input[index];
		}
		return evenSum - oddSum;
	}
	
	void displayDiff(int diff) {
		System.out.println("Difference is  : "+diff);
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,26,27,88,87,65};
		DiffBetEvebNumNOddNum diffBetEvebNumNOddNum  = new DiffBetEvebNumNOddNum();
		int diff = diffBetEvebNumNOddNum.getDiffBetEvnOdd(arr);
		diffBetEvebNumNOddNum.displayDiff(diff);
	}

}
