package stringAssignmnets.assignment22;

/*Assignment - 22 :  16th April'2021


Create a class with following functionality. [Estimated time: 40 mins]
a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits

b) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	          k -> 2
              n -> 1
              s -> 1
              h -> 1
             
c) Find all character frequency from each name given in String array.
     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
     Output : r -> 1 time in raj
              a -> 1 time in raj
              j -> 1 time in raj
         =====================
	     a -> 3 time in aarya
             r -> 1 time in aarya
              y -> 1 time in aarya
         ====================
         And so on....	----------------------------*/

public class ValidationOnString {
	
	void frequencyOfChar(String str, char targetChar) {
		int count = 0;
		for(int index = 0; index<str.length(); index++) {
			if(str.charAt(index)==targetChar)
				count++;
		}
		System.out.println(targetChar+" - "+count+" times in "+str);
	}
	
	void getFrequencyOfAllChar(String str) {
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch)==index)
				frequencyOfChar(str, ch);
			
		}
		
	}
	
	void getFrequencyOfArrayString(String[]  str) {
		for(int index= 0; index<str.length; index++) {
			String str1 = str[index];
			getFrequencyOfAllChar(str1);
		}
	}
	
	public static void main(String[] args) {
		String arr[] = {"raj", "aarya", "aavruti", "shruti"};
		ValidationOnString validationOnString = new ValidationOnString();
		validationOnString.frequencyOfChar("technocredits", 'e');
		validationOnString.getFrequencyOfAllChar("technocredits");
		validationOnString.getFrequencyOfArrayString(arr);
	}

}
