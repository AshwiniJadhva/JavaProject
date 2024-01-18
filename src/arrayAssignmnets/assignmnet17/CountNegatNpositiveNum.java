package arrayAssignmnets.assignmnet17;

/*Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4*/

public class CountNegatNpositiveNum {
	
	void getPositiveNegatNum(int[] input) {
		int positiveCount = 0;
		for(int index=0; index<input.length; index++) {
			if(input[index]>0)
				positiveCount++;
		}
		System.out.println("Positive Number  count - "+positiveCount);
		System.out.println("Negative Numver Count - "+(input.length-positiveCount));
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,26,-27,-88,87,-65};
		new CountNegatNpositiveNum().getPositiveNegatNum(arr);
	}

}
