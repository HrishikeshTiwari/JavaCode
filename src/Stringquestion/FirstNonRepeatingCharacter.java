package Stringquestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Find the First Non-Repeating Character
Problem: Given a string, find the first non-repeating character in it.
Example:
Input: "swiss"
Output: "w" 
 */

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string the string which you want");
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();		
		Map<Character, Integer> map= new HashMap<>();
		
		//for(char c:ch) {
		//	map.put(c,map.getOrDefault(c, 0)+1);
		//}
		
		// or
		for(int i=0;i<ch.length;i++) {
			map.put(ch[i],map.getOrDefault(ch[i], 0)+1);
		}
		
		for(Map.Entry<Character, Integer> obj:map.entrySet()) {
			if(obj.getValue()==1) {
				System.out.println(obj.getKey());
				return;
			}
	
			
		}
		
			System.out.println("There is no such string avialble");
		
		
		
		

	}

}
