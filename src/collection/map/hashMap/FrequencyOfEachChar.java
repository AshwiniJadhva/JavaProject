package collection.map.hashMap;

import java.util.HashMap;

public class FrequencyOfEachChar {
	
	static void getFreqOfEachChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			int count = 0;
			char ch = str.charAt(index);
			if (str.indexOf(ch) == index) {
				for (int innerIndex = 0; innerIndex < str.length(); innerIndex++)
					if (ch == str.charAt(innerIndex)) {
						count++;
					}

				System.out.println(ch + " count : " + count);
			}
		}

	}
	
	static void getFrequencyOfEachCharWithMap(String str) {
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		//int count = 0;
		for(int index = 0; index<str.length(); index++) {
			char ch = 	str.charAt(index);
			if(hm.containsKey(ch)) {
				int count = hm.get(ch)+1;
				hm.put(ch, count);
				
			}
			else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
	}
	
	

	public static void main(String[] args) {
		//getFreqOfEachChar("technocredits");
		getFrequencyOfEachCharWithMap("ashwinia");
		
	}

}
