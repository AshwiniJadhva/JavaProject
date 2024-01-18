package arrayAssignmnets.assignmnet17;

/*Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11*/

public class FindMinNum {
	
	int getMinNum(int[] input) {
		int minNum = input[0];
		for(int index = 0; index<input.length; index++) {
			if(minNum>input[index])
				minNum = input[index];
		}
		return minNum;
	}
	
	void displayMinNum(int minNum) {
		System.out.println("Minimum Number in given array is  - "+minNum);
	}
	
	public static void main(String[] args) {
		FindMinNum findMinNum = new FindMinNum();
		int[] arry = {22,35,65,88,11,23,45};
		int minNum = findMinNum.getMinNum(arry);
		findMinNum.displayMinNum(minNum);
	}

}
