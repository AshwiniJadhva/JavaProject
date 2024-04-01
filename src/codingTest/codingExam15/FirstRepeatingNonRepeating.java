package codingTest.codingExam15;



/*Test - 15 : 28th May'2021

Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/

public class FirstRepeatingNonRepeating {
	
	static void getWords(String str) {
		String[] input = str.split(" ");
		int max = 0;
		for (int index = 0; index < input.length; index++) {
			int count = 0;
			for (int innerIndex = index+1; innerIndex < input.length; innerIndex++) {
				if (input[index].equals(input[innerIndex])) {
					count++;
					break;
				}
			}
			if(count>max) {
				max = count;
				System.out.println(input[index]);
			}
			//else System.out.println(input[index]);

		}

	}
	 public static int firstRepeatingElement(int[] arr) {
	        // Nested loop to check for repeating elements
		// String[] arr = str.split(" ");
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                // If a repeating element is found, return its index
	                if (arr[i] == arr[j]) {
	                    return i;
	                }
	            }
	        }
	        // If no repeating element is found, return -1
	        return -1;
	    }
	
	
	public static void main(String[] args) {
		String str = "Hye Maulik Hi Techno Maulik Credits Techno Maulik Hello";
		 getWords(str);
		
		
		//String[] arr = str.split(" ");
		
		/*
		 * int[] arr = { 10, 5, 3, 4, 3, 5, 6 }; //int count =
		 * firstRepeatingElement(arr); if(count == -1) System.out.println("no"); else
		 * System.out.println(arr[count]);
		 */
		 
	}

}
