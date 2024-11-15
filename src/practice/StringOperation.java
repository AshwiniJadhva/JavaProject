package practice;

//return string with max digits

public class StringOperation {
	
	static int getCountInString(String str) {
		int count = 0;
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch))
				count++;
		}
		return count;
	}
	
	static String getStringWithMaxDigit(String [] arr) {
		int max = 0;
		String maxStr = "";
		for(int index = 0; index<arr.length; index++) {
			int count = getCountInString(arr[index]);
			if(count>max) {
				max = count;
				maxStr = arr[index];
			}
		}
		return maxStr;
	}
	
	public static void main(String[] args) {
		String[] str = {"Ashwi23n1i","Aji5nky","A5g4st32y1a","gh3or2pa1de"};
		String output = getStringWithMaxDigit(str);
		System.out.println(output);
		
	}

}
