package com.tricky;

public class FrequencyOfCharInSrting {
	
	void getFrequencyOfTargetChar(String str, char ch) {
		int count = 0;
		String strLower = str.toLowerCase();
		for(int index = 0;index<str.length();index++) {
			if(strLower.charAt(index)==ch)
				count++;
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		new FrequencyOfCharInSrting().getFrequencyOfTargetChar("Ashwini Jadhav", 'a');
	}

}
