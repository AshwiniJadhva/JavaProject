package collection.list;

import java.util.ArrayList;

//import java.util.Arrays;
//import java.util.List;

public class Example11 {
	
	static void printDuplicate(String[] input) {
		ArrayList<String> list = new ArrayList<String>();
		for (String word : input) {

			if (!list.contains(word)) {
				list.add(word);

			} else if (list.indexOf(word) == list.lastIndexOf(word)) {
				list.add(word);

				System.out.println(word + " : duplicate");
			}	
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		String[] name = {"good","Techno","Credits","Techno","ashwini","Credits","ashwini","hi","bad"};
		printDuplicate(name);
		
	}
}
