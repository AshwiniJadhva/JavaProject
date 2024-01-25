package stringAssignmnets.assignment18;

/*Program 4:  write a program which will print characters between ascii value 97 to 122.
*/
public class PrintChatBetRange {

	void printCharBetRange(int start, int end) {
		for(int index = start; index<=end; index++) {
			char ch = (char)index;
			System.out.println(ch);
			
		}
	}
	
	public static void main(String[] args) {
		new PrintChatBetRange().printCharBetRange(97, 122);
	}
	
}
