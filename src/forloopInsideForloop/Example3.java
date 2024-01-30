package forloopInsideForloop;

/*give me a number and  count of all number which are smaller than that number and which are ahead of that number.
(no.print karo and nober se pichale ususe chote number numbers ka count print karo)
ex.- input = int arr [] = {2,9,4,6,13,,12,11,78,3};
op = 
2->0
9->1
4->1
6->2
13->4
etc...
*/

public class Example3 {
	
	void validateNumbers(int[] arr) {
		for(int index = 0; index<arr.length; index++) {
			int count = 0;
			for(int innerIndex = 0; innerIndex<arr.length; innerIndex++) {
				if(index>innerIndex) {
					if(arr[index]>arr[innerIndex])
						count++;
				}
			}
			System.out.println(arr[index]+" -> "+count);
		}
	}
	
	public static void main(String[] args) {
		int arr [] = {2,9,4,6,13,12,11,78,3};
		new Example3().validateNumbers(arr);
	}

}
