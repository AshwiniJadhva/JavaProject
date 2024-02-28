package codingPractice;

public class RemoveDuplicate {
	
	void removeDup(String str) {
		String output = "";
		for(int index = 0;index<str.length();index++) {
			if(index==str.indexOf(str.charAt(index))) {
				output = output+str.charAt(index);
			}
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		new RemoveDuplicate().removeDup("geeks");
	}

}
