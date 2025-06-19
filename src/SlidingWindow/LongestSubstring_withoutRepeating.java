package SlidingWindow;

import java.util.HashSet;

public class LongestSubstring_withoutRepeating {

	public static void main(String[] args) {
		String str="abcabcbb";
		int length = lengthOfLongestSubstring(str);
		System.out.println("The longest substring is"+length);
		

	}
	
	
	public static int lengthOfLongestSubstring(String str) {
		
		int left=0, right=0;
		int maxlength=0;
		HashSet<Character> set= new HashSet<Character>();
		while(right<str.length()) {
			char ch= str.charAt(right);
			if(!set.contains(ch)) {
				set.add(ch);
				maxlength=Math.max(maxlength, right-left+1);
				right++;
			}
			else {
				set.remove(str.charAt(left));
				left++;
			}
			
			
		}
		return maxlength;
	}

}
