package arrayAssignmnets.assignmnet17;

/*Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/

public class FindMaxNum {
	
	int getMaxNum(int[] input) {
		int maxNum = input[0];
		for(int index = 1; index<input.length; index++) {
			if(maxNum<input[index])
				maxNum = input[index];
		}
		return maxNum;
	}
	
	void display(int maxNum) {
		System.out.println(" Maximun Number in given array is - "+maxNum);
	}
	
	public static void main(String[] args) {
		FindMaxNum findMaxNum = new FindMaxNum();
		int[] arr = {22,35,65,88,11,23,45};
		int maxNum = findMaxNum.getMaxNum(arr);
		findMaxNum.display(maxNum);
	}

}
