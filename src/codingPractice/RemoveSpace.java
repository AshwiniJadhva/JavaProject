package codingPractice;

/*Given a string, remove spaces from it. 

Example 1:

Input:
S = "geeks  for geeks"
Output: geeksforgeeks
Explanation: All the spaces have been 
removed.
Example 2:

Input: 
S = "    g f g"
Output: gfg
Explanation: All the spaces including
the leading ones have been removed.*/

public class RemoveSpace {
	
	String modify(String S)
    {
       String str = S.replaceAll(" ", "");
       return str;
    }
	
	void strModify(String str) {
		
		String output = "";
		
		for(int index = 0;index<str.length();index++) {
			if(str.charAt(index)!=' ') {
				output = output+str.charAt(index);
				
			}
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		RemoveSpace space = new RemoveSpace();
		// String output= space.modify("geeks  for geeks");
		//System.out.println(output);
		space.strModify("geeks  for geeks");
		
	}
	

}
