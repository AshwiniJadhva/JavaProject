package forloopInsideForloop;

/*int arr[] = {2,3,4,2,2,3,5,4}; find frequency of each no. in given array*/

public class Example2 {
	
	void findFrequnecy(int[] arr) {
		for(int index=0; index<arr.length;index++) {
		
			int count = 0;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==arr[index])
					count++;
			}
			System.out.println("count of "+arr[index]+" is - "+count+" times");
		}
		
	}
	
	/*
	 * void printAllNumFrequnecy(int arr[]) { for(int index=0;
	 * index<arr.length;index++) { findFrequnecy(arr, arr[index]); } }
	 */
	
	public static void main(String[] args) {
		
		int arr[] = {2,3,4,2,2,3,5,4};
		Example2 example2 = new  Example2();
		example2.findFrequnecy(arr);
		//example2.printAllNumFrequnecy(arr);
	}

}
