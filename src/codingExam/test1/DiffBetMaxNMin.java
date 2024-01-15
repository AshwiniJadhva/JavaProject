/*
 * Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
 */
package codingExam.test1;
public class DiffBetMaxNMin {
	
	void getDifference(int arr[]) {
		int maxNum = arr[0];
		int minNum = arr[0];
		for(int index= 0 ; index<arr.length; index++) {
			if(maxNum<arr[index]) 
				maxNum = arr[index];
			if(minNum>arr[index])
				minNum = arr[index];
			
		}
		System.out.println("max number : "+maxNum);
		System.out.println("min number : "+minNum);
		System.out.println("difference is : "+(maxNum-minNum));
	}
	
	public static void main(String[] args) {
		int arr[] = {70 ,12, -56, 62, 25};
		new DiffBetMaxNMin().getDifference(arr);
	}
	

}
