package com.tricky;

public class FrequencyOfChar {
	
	void getFrequencyOfchar(String str , char ch) {
		int count = 0;
		for(int index = 0; index<str.length(); index++) {
			if(str.charAt(index)==ch) {
				count++;
				
			}
		}
		
		System.out.println("giver char "+ch+" frequncy is "+count);
	}
	
	void getFrequencyOfAllChr(String str) {
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(index == str.indexOf(ch))
				getFrequencyOfchar(str, ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrequencyOfChar frequencyOfChar = new  FrequencyOfChar();
		//frequencyOfChar.getFrequencyOfchar("Ashwini", 'i');
		frequencyOfChar.getFrequencyOfAllChr("aakanksha");
		

	}

}
