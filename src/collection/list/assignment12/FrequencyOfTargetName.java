package collection.list.assignment12;

/*
*  int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"]
output : 3

*/

import java.util.ArrayList;

public class FrequencyOfTargetName {
	int countName(ArrayList<String> arr, String targetName) {
		//ArrayList<String> name = new ArrayList<String>();
		int count = 0;
		for(int index = 0; index<arr.size(); index++) {
			if(arr.get(index).contains(targetName)) {
				count++;
			}
				
		}
		System.out.println(arr);
		return count;
	}
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		FrequencyOfTargetName targetName = new  FrequencyOfTargetName();
		String[] arr ={ "Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav" };
		String targateName = "Aashay";
		for(int index = 0; index<arr.length; index++) {
			nameList.add(index,arr[index]);
		}
		int count = targetName.countName(nameList,targateName );
		System.out.println(count);
	}

}
