package forloopInsideForloop;

/*find the frequency of each char from gievn string = "techanocredits"*/

public class FrequencyOfEachChar {
	
	void printFrequencyofChar(String str) {
		for(int index = 0; index<str.length(); index++) {
			int count = 0;
			if(str.indexOf(str.charAt(index))==index) {
				for(int innerIndex = 0; innerIndex<str.length(); innerIndex++) {
					if(str.charAt(index)==str.charAt(innerIndex))
						count++;
				}
				
				System.out.println(str.charAt(index)+" is -"+count+ " times");
				
			}
		}
	}

	public static void main(String[] args) {
		new FrequencyOfEachChar().printFrequencyofChar("techanocredits");
	}
}
