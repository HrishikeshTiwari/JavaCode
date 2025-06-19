package ArrayBasic;

import java.util.HashMap;
import java.util.Map;

/*
 Use sliding window and hashmap to find the length of the greatest substring without duplicate character.
 
 Algorithm:-1
 1. Initialize two pointers Start and end with 0.
 2. the end pointer moves from left to right extending the current window.
 3. run a loop and check if there is any repeated character then increment the start to next location.
 4. if there is no any repeated character add in the map with the index of the element.
 4. then find the length of longest substring by a formula: end-start+1;
 */

public class LongestSubstring {

	public static void main(String[] args) {
		String str="abcabcbb";
	//	LongestSubstring obj= new LongestSubstring();
		
		int Maxlength=lengthofLongestSubstring(str);
		System.out.println("The length of the longest substring is"+Maxlength);
		

	}
	
	public static int lengthofLongestSubstring(String str) {
		

		
	    int start=0;
		int end=0;
		int maxlength=0;
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		
		for(end=0;end<str.length();end++) {
		 char cur=str.charAt(end);
		 
		 if(map.containsKey(cur)) { // if char is repeating
			 start=Math.max(start, map.get(cur)+1);  
		 }
		 
		 map.put(cur, end);
		 maxlength=Math.max(maxlength, end-start+1);
		}
		
		return maxlength;
	}
	

}
/*
 *  start=Math.max(start, map.get(cur)+1); explanation of this line
 * 
 * map.get(cur) + 1: The reason we add 1 is that we need to update the start pointer to the position just after the
 *  last occurrence of the character cur. This ensures that the new window starting at start will
 *  exclude the previous duplicate character.
 *  
 *  
 *  In summary, the map.get(cur) + 1 ensures that start always points to the position right after the last occurrence 
 *  of the duplicate character, effectively skipping the duplicate and allowing you to explore a new valid substring.
 * 
 */
