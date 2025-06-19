package Stringquestion;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_Duplicate_from_String {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the string which you want");
		
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		Set<Character> set= new LinkedHashSet();
		
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		
		//System.out.println(set);
		
		
		// converting back to string
		
		StringBuilder result=new StringBuilder();
		for(Character character:set) {
			result.append(character);
		}
		
		System.out.println("the string after removing the duplicate is" +result.toString());
		

	}

}


/*
 * 
 * 
 * So, here's a simplified explanation of what each part does:
 * LinkedHashSet(); to maintain the insertion order.

Set: Holds unique characters but doesn't guarantee string formatting or output.

StringBuilder: Helps in constructing the result string from the set of characters.

toString() is necessary to convert the StringBuilder content into a String since StringBuilder itself is not a string object.
 */
