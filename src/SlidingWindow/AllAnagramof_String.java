package SlidingWindow;
/*
 * Approach:
Use an array of size 26 to store the frequency of characters in p (pFreq).

Maintain a sliding window of size p.length() on s, using another frequency array (sFreq).

Move the window forward one character at a time:

Add the new character at the right.

Remove the leftmost character (when window size exceeds p.length()).

Compare both frequency arrays to check for an anagram.


 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagramof_String {

	public static void main(String[] args) {

		 String s = "cbaebabacd";
	     String p = "abc";
	     System.out.println(findAnagrams(s, p));

	}
	
	
	public static List<Integer> findAnagrams(String str, String p) {

      List<Integer> result= new ArrayList<Integer>();
      
      // Edge case
      
      if(str.length()<p.length()) return result;
      
      int pfrequency[]= new int[26];   // Frequency array for pattern 'p'
      int strfrequency[]= new int[26];    // Frequency array for pattern 'str'
      
   // Fill frequency for 'p'
      
      for(char ch:p.toCharArray()) {
    	  pfrequency[ch-'a']++;
    	  
      }
      
      int windowSize = p.length();
      
      // Process first window
      for(int i=0;i<windowSize;i++) {
    	  strfrequency[str.charAt(i)-'a']++; 
      }
      
   // Compare first window
      if (Arrays.equals(pfrequency, strfrequency)) result.add(0);
      
   // Slide the window across 'str'
      
      for(int i=windowSize;i<str.length();i++) {
    	  strfrequency[str.charAt(i)-'a']++;   // Adding new element;
    	  // Remove leftmost character from window
    	  strfrequency[(str.charAt(i-windowSize))-'a']--;
    	// Compare frequency arrays
    	  
    	  if(Arrays.equals(pfrequency, strfrequency)) {
    		  result.add(i-windowSize+1);
    	  }
    	  
      }
      
      return result;

		
	}
	
	

}
