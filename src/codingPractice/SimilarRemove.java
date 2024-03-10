package codingPractice;

/*Input:
S = aabb
Output:  ab 
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
Similiar explanation for b at
4th position.

Example 2:

Input:
S = aabaa
Output:  aba
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
'a' at fifth position is appearing
2nd time consecutively.*/

public class SimilarRemove {
	
	void removeSimilarChar(String str) {
		
		String output = "";
		 
		for(int index = 1; index<str.length(); index++) {
			//char ch = str.charAt(index);
			if(str.charAt(index)==str.charAt(index)) {
				output= output+str.charAt(index-1);
				index++;
			}
		}
		
		System.out.println(output);
	}
	
	 String findConsecutiveRepeatingChars(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                result.append(input.charAt(i));
                while (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                    i++;
                }
            }
        }

        return result.toString();
    }
	 
	 public static String deleteConsecutiveStrings(String s)
	  {
	 
	    // Initialize start and stop pointers
	    int i = 0;
	    int j = 0;
	 
	    // Initialize an empty string for new elements
	    String newElements = "";
	 
	    // Iterate string using j pointer
	    while (j < s.length()) {
	 
	      // If both elements are same then skip
	      if (s.charAt(i) == s.charAt(j)) {
	        j++;
	      }
	 
	      // If both elements are not same then append new
	      // element
	      else if (s.charAt(j) != s.charAt(i)
	               || j == s.length() - 1) {
	        newElements += s.charAt(i);
	 
	        // After appending, slide over the window
	        i = j;
	        j++;
	      }
	    }
	 
	    // Append the last string
	    newElements += s.charAt(j - 1);
	    return newElements;
	  }
	
	
	public static void main(String[] args) {
		/*
		 * SimilarRemove remove = new SimilarRemove();
		 * //remove.removeSimilarChar("bcdebeaec"); String output =
		 * remove.findConsecutiveRepeatingChars("aabaa"); System.out.println(output);
		 */
		
		String s = "geeks for geeks is best";
		 
	    // Printing original string
	    System.out.println("Input  : " + s);
	 
	    // Printing result
	    System.out.println("Output : "
	                       + deleteConsecutiveStrings(s));
		
	}

}
