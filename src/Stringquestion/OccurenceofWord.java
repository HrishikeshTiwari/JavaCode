package Stringquestion;

import java.util.HashMap;
import java.util.Map;

public class OccurenceofWord {

	public static void main(String[] args) {

      String word="Hello java hello python";
      word=word.toLowerCase();
      String words[]=word.split("\\s+");
      //char words[]=word.toCharArray();
     
      Map<String, Integer> map= new HashMap<>();
      for(String element:words)
      map.put(element, map.getOrDefault(element, 0)+1);
      System.out.println(map);

	}
	
	

}
