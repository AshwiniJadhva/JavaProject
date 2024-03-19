package codingPractice;

public class PrintDuplicate {
	
	static void getAllDuplicate(String[] str) {
		String[] output = new String[str.length];
		int count = 0;
		for(int index = 0; index<str.length;index++) {
			for(int innerIndex = index+1; innerIndex<str.length; innerIndex++) {
				if(str[index]==str[innerIndex]) {
					output[count] = str[innerIndex];
					count++;
				}
			}
		}
		for(int index = 0 ;index<count; index++) {
			System.out.println(output[index]);	
		}
	}
	public static void main(String[] args) {
		String[] str = {"Ashwini", "Ajinkya","Ashwini","abc","pqr","abc","kh"};
		getAllDuplicate(str);
	}

}
