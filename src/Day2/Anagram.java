/*
 * Checking if Two Strings are Anagrams in Java
To check if two strings are anagrams, you can:

Convert both strings to lowercase (to ignore case sensitivity).
Sort the characters of both strings.
Compare if the sorted versions are equal.
 */

package Day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="Heart";
		String str2="Earth";
		
		if(anagram(str1,str2)) {
			System.out.println("The string is Anagram");
		}
		
		else {
			System.out.println("the string is not anagram of each other");
		}
		

	}
	
	
	public static boolean anagram(String str1,String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[] arr1= str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
		
	/*	if(arr1.equals(arr2)) {
			return true;
		}
		else {
			return false;
		}
		*/
		
		/*Incorrect Array Comparison:
			You are using if(arr1.equals(arr2)), but equals() checks object reference, not content.
			Instead, use Arrays.equals(arr1, arr2) to compare contents correctly.
			*/
		
	}

}
