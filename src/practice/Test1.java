package practice;

/*//Input s = "My name is Ashwini"

Output = 4 (4 words);*/
public class Test1 {
	static void getoutput1() {
		String s = "My name is Ashwini";
		String[] str = s.split(" ");
		int size = str.length;
		System.out.println(size);
		
	}
	static void getoutput2() {
		String s = "My Name is Ashwini ";
		int count = 0;
		for(int index = 0; index<s.length()-1;index++) {
			if(s.charAt(index)==' '&& s.charAt(index+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	static void getoutput3() {
		int count = 0;
        boolean isWord = false;
        String s = "";
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // If the character is not a space and we are not in a word, increment count
            if (s.charAt(i) != ' ' && !isWord) {
                count++;
                isWord = true; // Set flag to indicate we are in a word
            }
            // If the character is a space, set flag to indicate we are not in a word
            else if (s.charAt(i) == ' ') {
                isWord = false;
            }
        }
        System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		//getoutput1();
		getoutput2();
		//getoutput3();
		
	}
}
