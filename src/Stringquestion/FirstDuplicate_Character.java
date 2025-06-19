package Stringquestion;

import java.util.HashSet;
import java.util.Set;

/*
public class FirstDuplicate_Character {

	public static void main(String[] args) {
		
		String str="Hrishikersh";
		char ch =findduplicate(str);
		System.out.println("the firsr duplicate character is\n"+ch);

	}
	
	public static Character findduplicate(String str) {
		HashSet<Character> set= new HashSet<>();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(set.contains(ch)) {
				return ch;
			}
			set.add(ch);
		}
		return null;
	}

}

*/   

// Another way

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstDuplicate_Character {

    public static Character findFirstDuplicate(String str) {
    	str=str.toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Second loop to find the first character with count > 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String str = "Hrishikersh";
        Character result = findFirstDuplicate(str);

        if (result != null) {
            System.out.println("First duplicate character: " + result);
        } else {
            System.out.println("No duplicate character found.");
        }
    }
}

