package collection.map.hashMap;

import java.util.HashMap;

public class Example1 {
	public static void main(String[] args) {
		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Ashwini");
		hm.put(1, null);
		hm.put(3, "Ajinkya");
		hm.put(4, "Agastya");
		hm.put(5, " ");
		System.out.println(hm);
		System.out.println(hm.size());
	}
	

}
