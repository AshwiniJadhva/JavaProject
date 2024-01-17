package stringAssignmnets;

/*Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2
Note : without handling case sensitivity  - getFrequencyOfTargetChar()
*/

public class FrequencyOfTargetChar {
	
	void getFrequencyOfTargetChar(String str,  char targetedCh) {
		int targetedChCount = 0;
		for(int index = 0 ; index<str.length(); index++) {
			if(str.charAt(index)== targetedCh)
				targetedChCount++;
		}
		System.out.println(targetedCh+" Char count is "+targetedChCount);
	}
	
	void etFrequencyOfTargetCharCaseSen(String str , char targetCh) {
		str = str.toLowerCase();
		targetCh = Character.toLowerCase(targetCh);
		int targetedChCount=0;
		for(int index = 0; index<str.length(); index++) {
			if(str.charAt(index) == targetCh)
				targetedChCount++;
		}
		System.out.println(targetCh +" Char count is "+targetedChCount);
		
	}
	
	public static void main(String[] args) {
		FrequencyOfTargetChar frequencyOfTargetChar = new FrequencyOfTargetChar();
		frequencyOfTargetChar.getFrequencyOfTargetChar("Ashwini",'a');
		frequencyOfTargetChar.etFrequencyOfTargetCharCaseSen("Aashwini", 'a');
		
	}

}
