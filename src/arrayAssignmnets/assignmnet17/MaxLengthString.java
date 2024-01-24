package arrayAssignmnets.assignmnet17;

/*Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

public class MaxLengthString {
	
	String getMaxLengthStr(String[] input) {
		String maxLengthStr = input[0];
		for(int index = 1; index<input.length; index++) {
			if(maxLengthStr.length()<input[index].length())
				maxLengthStr = input[index];
		}
		return maxLengthStr;
	}
	
	void displayMaxStr(String str) {
		System.out.println(str);
		System.out.println("");
	}
	
	public static void main(String[] args) {
		String[] str = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh," , "AshwiniJadhavGhorpade"," Ashu"};
		MaxLengthString maxLengthString = new MaxLengthString();
		String maxStr = maxLengthString.getMaxLengthStr(str);
		maxLengthString.displayMaxStr(maxStr);
	}

}
