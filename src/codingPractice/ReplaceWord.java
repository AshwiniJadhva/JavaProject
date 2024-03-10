package codingPractice;

public class ReplaceWord {
	
	static int getWordCount(String str){
		int count = 0;
		while(str.contains("techno")){
			count++;
			str = str.replaceFirst("techno","");
		}
		System.out.println(count);
		return count;
	}
	
	static int getGivenWordCount(String str){
		int count = 0;
			for(int index = 0;index<str.length();index++) {
				if(str.contains("techno")){
					str = str.replaceFirst("techno","");
					count++;
			}
		}
		
		System.out.println(count);
		return count;
	}
	
	
	public static void main(String[] args) {
	//	getWordCount("ashwini techno hi techno hello techno bye");
		getGivenWordCount("ashwini techno hi techno hello techno bye");
	}

}
