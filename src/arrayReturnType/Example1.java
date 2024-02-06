package arrayReturnType;

public class Example1 {
	
	int outputIndex = 0;
	int[] getAllPoitiveNums(int[] arr) {
		int output[]=  new int[arr.length];
		for(int index = 0; index<arr.length; index++) {
			if(arr[index]>0) {
				output[outputIndex]=arr[index];
				outputIndex++;
			}
		}
		return output;
	}
	
	
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		int arr[] = {-2,3,1,-45,-7,12,-98,5,10};
		int[]postiveNum = example1.getAllPoitiveNums(arr);
		for(int index = 0; index<example1.outputIndex; index++) {
			System.out.println(postiveNum[index]);
		}
	}
}
