package codingTest.codingExam3;

/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

		 input :  globant india test automation engineer

		 output :  glbnt nd tst tmtn ngnr

		Branch name :
		Yourname_coding_exam_3

		All the best !!!



		Commit message :
		Yourname_coding_exam_3_time
*/

public class DeleteVovel {
	
	
	
	String validateString(String str) {
		String output = "";
		for(int index = 0; index<str.length();index++) {
			char ch  = Character.toLowerCase(str.charAt(index));
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') 
				output = output+str.charAt(index);
		}
		return output;
	}
	
	public static void main(String[] args) {
		String input = "glObant india test automation engineer";
		DeleteVovel vovel = new DeleteVovel();
		String output = vovel.validateString(input);
		System.out.println(output);
	}

}
