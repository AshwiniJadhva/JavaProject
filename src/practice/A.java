package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class A {
	
	private int x =10;
	
	static void tryMap() {
		HashMap<String, List<String>> listMap = new HashMap<String, List<String>>();
		List<String>  list1 = new ArrayList<String>();
		list1.add("banana");
		list1.add("apple");
		
		List<String>  list2 = new ArrayList<String>();
		list2.add("methi");
		list2.add("palak");
		
		listMap.put("veg", list2);
		listMap.put("fruits", list1);
		
		System.out.println(listMap);
	}
	
	void m1() throws ArrayIndexOutOfBoundsException {
		System.out.println("hi a");
	}
	
	public static void main(String[] args) {
		tryMap();
	}

}
