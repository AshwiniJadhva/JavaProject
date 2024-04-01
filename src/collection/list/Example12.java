package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example12 {
	
	public static void main(String[] args) {
		String[] name = {"Techno","Credits","Techno", "Credits", "Techno","ashwini"};
		List<String> list = Arrays.asList(name);
		ArrayList<String> newList = new ArrayList<String>();
		
		for(String word : list) {
			int index = list.indexOf(word);
			int lindex = list.lastIndexOf(word);
			if((list.indexOf(word) != list.lastIndexOf(word)) && !newList.contains(word)) {
				
				System.out.println(word + " : Duplicate element");
				newList.add(word);
			}
		}
		
		
	}
}
