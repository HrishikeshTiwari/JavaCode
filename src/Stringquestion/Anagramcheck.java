package Stringquestion;

import java.util.Arrays;

/*
 * Problem: Two strings are anagrams if they contain the same characters but in a different order.
Example:

Input: "listen", "silent"
Output: true

Input: "hello", "world"
Output: false
 */

public class Anagramcheck {

	public static void main(String[] args) {
		
		String str1="Llisten";
		str1=str1.toLowerCase();
        char ch1[]=str1.toCharArray();
		
		String str2="silent";
		str2=str2.toLowerCase();
		char ch2[]=str1.toCharArray();
		
		if(str1.length()!=str2.length()) {
			System.out.println("The string is not anagram");
			return;
		}
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("the string is anagram of each other");
		}
		
		else {
			System.out.println("the string is not anagram of each other");
		}
			
		
		

	}

}
