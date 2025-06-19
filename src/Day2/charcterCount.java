package Day2;

import java.util.HashMap;
import java.util.Map;

public class charcterCount {

	public static void main(String[] args) {

       String str="Hrishikesh";
       count(str);

	}
	
	public static void count(String str) {
		
		HashMap<Character, Integer> map= new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		//System.out.println(map);
		
		// OR another way we can also traverse the map to count the key and value.
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
			
			
		}
		
	}

}
