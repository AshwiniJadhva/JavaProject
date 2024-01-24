package arrayAssignmnets.assignmnet17;

/*Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4
*/
public class FrequencyOfTargateNum {
	
	void getFrequncyOfTargetNum(int[] input, int targateNum) {
		int Count = 0;
		for(int index=0; index<input.length; index++) {
			if(input[index]==targateNum)
				Count++;
		}
		System.out.println("Frequency Of Targate Numbe ris  - "+Count);
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,23,44,23,10,23,4,23};
		new FrequencyOfTargateNum().getFrequncyOfTargetNum(arr, 23);
	}

}
