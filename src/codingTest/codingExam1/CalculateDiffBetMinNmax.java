package codingTest.codingExam1;

/*Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55*/

public class CalculateDiffBetMinNmax {
	
	void getMinMaxdiff(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for(int index = 0; index<arr.length;index++) {
			if(max<arr[index])
				max = arr[index];
			else if(min>arr[index])
				min = arr[index];
		}
		
		System.out.println("diff bet younder and older is -  "+(max-min));
	}
	public static void main(String[] args) {
		int[] arr = {7 ,12 ,56, 62 ,25, 3};
		CalculateDiffBetMinNmax diffBetMinNmax = new CalculateDiffBetMinNmax();
		diffBetMinNmax.getMinMaxdiff(arr);
	}

}
