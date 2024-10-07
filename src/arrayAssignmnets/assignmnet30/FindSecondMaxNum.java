package arrayAssignmnets.assignmnet30;

/*Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55*/

public class FindSecondMaxNum {
	
	int getSecondMaxNum(int[] arr) {
		int max = arr[0];
		int secondMax = arr[1];
		for(int index = 0;index<arr.length;index++) {
			if(max<arr[index]) {
				secondMax = max;
				max = arr[index];
			}
			else if(secondMax<arr[index])
				secondMax = arr[index];
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		int arr [] = {50,23,43,1,6,7,8};
			//{7,10,33,43,55,105,97,11,3,100};
		FindSecondMaxNum secondMaxNum = new FindSecondMaxNum();
		int output = secondMaxNum.getSecondMaxNum(arr);
		System.out.println(output);
	}

}
