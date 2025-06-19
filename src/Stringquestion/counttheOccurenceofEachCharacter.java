package Stringquestion;

import java.util.HashMap;
import java.util.Map;

public class counttheOccurenceofEachCharacter {

	public static void main(String[] args) {
		String str="Hrishikesh";
		
		Map<Character,Integer> map= new HashMap<Character, Integer>();
		
		for(char ch:str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		//System.out.println(map);
		
		for(Map.Entry<Character, Integer> obj:map.entrySet()) {
			System.out.println(obj.getKey()+" " +obj.getValue());
		}

	}

}
