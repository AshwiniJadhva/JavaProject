package arrayReturnType.assignmnet24;

/*Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.
*/
public class ReturnMIddleChar {
	
	char[] getMiddleChar(String[] str) {
		char[] outputCh = new char[str.length];
		for(int index=0; index<str.length;index++) {
			if(str[index].length()%2==0) {
				
				outputCh[index] = str[index].charAt(str[index].length()/2-1);
			}
			else outputCh[index] = str[index].charAt(str[index].length()/2);
		}
		return outputCh;
	
	}
	
	public static void main(String[] args) {
		String[] arr = {"Techno", "Hello", "Credits"};	
		ReturnMIddleChar returnMIddleChar = new ReturnMIddleChar();
		char[] outputchar = returnMIddleChar.getMiddleChar(arr);
		for(int index=0 ;index<outputchar.length;index++) {
			System.out.println(outputchar[index]);
		}
	}

}
