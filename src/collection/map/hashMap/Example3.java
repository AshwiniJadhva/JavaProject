package collection.map.hashMap;

import java.util.HashMap;

public class Example3 {
	public static void main(String[] args) {
		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Ashwini");
		hm.put(1, "Ghorpade");
		hm.put(3, "Ajinkya");
		hm.put(4, "Agastya");
		hm.put(5, " Welcome");
		System.out.println(hm);
		System.out.println(hm.size());
		String temp = hm.get(6);
		System.out.println(temp);//null
	}

}
