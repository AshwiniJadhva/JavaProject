package arrayAssignmnets.assignmnet17;

/*Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/

public class MaxLengthStrIndex {
	
	int getMaxStrIndex(String[] str ) {
		int maxStr = 0;
		for(int index=0; index<str.length; index++) {
			if(str[maxStr].length()<str[index].length())
				maxStr = index;
		}
		return maxStr;
	}
	
	void displayMaxStrIndex(int maxIndex) {
		System.out.println(maxIndex);
	}
	
	
	public static void main(String[] args) {
		String input[] = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh","ash"};
		MaxLengthStrIndex maxLengthStrIndex = new MaxLengthStrIndex();
		int maxIndex = maxLengthStrIndex.getMaxStrIndex(input);
		maxLengthStrIndex.displayMaxStrIndex(maxIndex);
		
	}

}
