package Stringquestion;

import java.util.HashMap;
import java.util.Map;

/*
 * Longest Substring Without Repeating Characters
Problem: Given a string, find the length of the longest substring without repeating characters.
Example:

Input: "abcabcbb"
Output: 3   // "abc"
👉 Hint: Use the Sliding Window technique with HashSet. 
to find the maxlength use this formula maxlength=end-start+1
 */

public class LongestSubstring {

	public static void main(String[] args) {
		String str="Naveen";
		int maxlength=Longestsubarray(str);
		System.out.println("The length of longest substring is"+maxlength);

	}
	
	public static int Longestsubarray(String str) {
		int maxlength=0;
		int start=0;
		int end=0;
		int maxstart=0;
		int maxend=0;
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		for(end=0;end<str.length();end++) {
			char ch=str.charAt(end);
			
			if(map.containsKey(ch)) {
				start=Math.max(start, map.get(ch)+1);
				
			}
			
			map.put(ch, end);
			
			//maxlength=Math.max(maxlength, end-start+1);
			
			// or another way. above method is used when we want to print only length but below method is used when we want to print substring also.
			
			if(end-start+1>maxlength) {
				maxlength=end-start+1;
				maxstart=start;
				maxend=end;
			}
		}
		
		System.out.println("The longest substring with repeation is"+str.substring(maxstart,maxend+1));
		return maxlength;
	}

}
