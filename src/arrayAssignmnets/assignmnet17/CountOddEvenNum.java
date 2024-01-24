package arrayAssignmnets.assignmnet17;

/*Assignment - 17 : 10th April'2021

Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount*/

public class CountOddEvenNum {
	
	void getCountOfOddEven(int[] input) {
		int evenCount=0;
		
		for(int index=0; index<input.length; index++) {
			if(input[index]%2==0)
				evenCount++;
		}
		System.out.println("Even Count is - "+evenCount);
		System.out.println("Odd Number Count is - "+(input.length-evenCount));
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int[] arr= {10,23,26,27,88,87,65};
		new CountOddEvenNum().getCountOfOddEven(arr);
	}

}
