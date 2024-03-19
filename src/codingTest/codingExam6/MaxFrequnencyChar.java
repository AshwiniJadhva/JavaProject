package codingTest.codingExam6;

/*Test - 6 : [Complexity : Easy] :14th May'2021
Find a Character having a maximum frequency.

input : globant india is hiring

output : i*/

public class MaxFrequnencyChar {
	
	static int getMaxCharCount(String str, char ch) {
		int count = 0;
		for(int index = 0; index<str.length(); index++) {
			if(str.charAt(index)==ch)
				count++;
		}
		
		return count;
	}
	
	static char getCharWithMaxFre(String str) {
		int max = 0;
		char ch =' ';
		
		for(int index = 0; index<str.length(); index++) {
			char temp = str.charAt(index);
			int count = getMaxCharCount(str,temp);
			if(count>max) {
				max = count;
				ch = temp;
			}
		}
		
		return ch;
	}
	
	public static char findMaxFrequencyCharacter(String str) {
        char maxChar = str.charAt(0); // Initialize the character with maximum frequency
        int maxFrequency = 0; // Initialize the maximum frequency

        // Iterate through the string
        for (char c = 0; c < Character.MAX_VALUE; c++) {
            int frequency = 0; // Initialize frequency of current character

            // Count the frequency of current character in the string
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    frequency++;
                }
            }

            // Update maxChar and maxFrequency if a character with higher frequency is found
            if (frequency > maxFrequency && Character.isLetterOrDigit(c)) {
                maxFrequency = frequency;
                maxChar = c;
            }
        }

        return maxChar;
    }
	
	public static void main(String[] args) {
	//	getMaxCharCount("Ashwini", 'i');
		String str = "globant india is hiring i pppppppppppp m";
		//char ch = findMaxFrequencyCharacter(str);
		char ch = getCharWithMaxFre(str);
		System.out.println(ch);
	}

}
