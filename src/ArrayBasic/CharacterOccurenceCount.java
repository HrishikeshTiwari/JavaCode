package ArrayBasic;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurenceCount {

	public static void main(String[] args) {
		
		String str="Hrishikesh Tiwari";
		
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		
	/*	for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') 
			if(map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);
			}	
			else {
				map.put(ch, 1);
	}
		}
			System.out.println(map);
		}
}
	
		*/
		
		
		
		//OR
		
		
		for(char ch:str.toCharArray()) {
			
			if(ch!=' ') {
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
			
		}
		
		//System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
	}
	}
		



