package collection.list;

import java.util.ArrayList;

public class Example6 {
	
	void validateArrayList(ArrayList<String> nameList) {
		ArrayList<String> output = new ArrayList<String>();
		for(int index = 0; index<nameList.size(); index++) {
			if(nameList.get(index).length()%2==0)
				output.add(nameList.get(index));
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Techno");
		nameList.add("Krishna");
		nameList.add("Ashwini");
		nameList.add("Ajinkyaa");
		nameList.add("Pune");
		nameList.add(5, "Hi");
		nameList.add(nameList.size(), "Hello");
		System.out.println(nameList);
		System.out.println("Size is  - "+nameList.size());
		
		Example6 example6 = new Example6();
		example6.validateArrayList(nameList);
	}
}
