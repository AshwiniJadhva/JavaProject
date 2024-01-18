package arrayAssignmnets.assignmnet17;

/*Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}  */

public class FindTargetNumIsAvailable {
	
	int count = 0;
	boolean isNumberPresent(int[] input,int targetNum) {
		for(int index=0; index<input.length; index++) {
			if(input[index] == targetNum)
				count++;
		}
		if(count>0)
			return true;
		else return false;
		
	}
	
	void display(boolean availability, int targetNum) {
		if(availability)
			System.out.println(targetNum+" found in given array ");
		else
			System.out.println(targetNum+" doesnt found in given array");
	}
	
	public static void main(String[] args) {
		int arr[] = {10,23,23,44,23,10,23,4,23};
		int tagetNum = 45;
		FindTargetNumIsAvailable targetNumIsAvailable = new FindTargetNumIsAvailable();
		boolean  yes = targetNumIsAvailable.isNumberPresent(arr,tagetNum);
		targetNumIsAvailable.display(yes, tagetNum);
	}

}
