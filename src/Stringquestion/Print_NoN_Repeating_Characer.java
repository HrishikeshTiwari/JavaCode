package Stringquestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Print_NoN_Repeating_Characer {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String which you want");
		String str=sc.nextLine();
		str=str.toLowerCase();
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		
		// or 
	
		/*
		for(char cha:ch) {
			map.put(cha,map.getOrDefault(cha, 0)+1);
			
		}
		*/
		
		// Traversing the Map
		
		for(Map.Entry<Character, Integer> element:map.entrySet()) {
			if(element.getValue()==1) {
				System.out.println(element.getKey()+" ");
			}
		}

	}

}

/*
 * 
 * map.getOrDefault(ch[i], ...):

This method checks whether the key ch[i] already exists in the map.

If it does exist, it returns the current value associated with that key.

If it doesn't exist, it returns the default value you provide as the second argument. In this case,
 */
