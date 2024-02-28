package codingPractice;

/*
 * Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.

input : globant india is hiring

output : i
 */

public class ReturncharwithmaxFrequency {
	
	public static char getMaxOccuringChar(String line)
    {
        int count=0;
        char ch = ' ' ;
        int max = 0;
        
        for(int index = 0;index<line.length();index++) {
        	char tempChar = line.charAt(index);
        	for(int innerIndex = 0;innerIndex<line.length();innerIndex++) {
        		if(line.charAt(innerIndex)==line.charAt(index)) {
        			count++;
        		}
        	}
        	if(max<count) {
        		max = count;
        		count =0;
        		ch = tempChar;
        	}
        	else count = 0;
        }
        return ch;
            
    }
	
	public static void main(String[] args) {
		char ch = ReturncharwithmaxFrequency.getMaxOccuringChar("globant india is hiring");
		System.out.println(ch);
	}

}
