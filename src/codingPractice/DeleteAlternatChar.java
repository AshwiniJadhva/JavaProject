package codingPractice;

/*Given a string S as input. Delete the characters at odd indices of the string.
xample 1:

Input: S = "Geeks"
Output: "Ges" 
Explanation: Deleted "e" at index 1
and "k" at index 3.
Example 2:

Input: S = "GeeksforGeeks"
Output: "GesoGes"
Explanation: Deleted e, k, f, r, e
k at index 1, 3, 5, 7, 9, 11.*/

public class DeleteAlternatChar {
	
	static String delAlternate(String S) {
        // code here
        
        String output = "";
        for(int index = 0;index<S.length();index++){
            if(index%2==0){
                  output= output+S.charAt(index);
            }
        }
        return output;
    }
	
	public static void main(String[] args) {
		String output = DeleteAlternatChar.delAlternate("geaks");
		System.out.println(output);
	}

}
