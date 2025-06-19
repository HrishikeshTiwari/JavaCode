package Day2;

import java.util.HashMap;
import java.util.Map;

public class Frequency_of_element {

	public static void main(String[] args) {

      int arr[]= {1, 2, 2, 3, 4, 4, 4};
      
      countfrequnecy(arr);

	}
	
	
	public static void countfrequnecy(int arr[]) {
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		
	/*	 for(int num:arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		System.out.println(map);
		*/
		
		for(int num:arr)
			
			if(map.containsKey(num)) {
				map.put(num,map.get(num)+1);
			}
			else {
				map.put(num, 1);
			}
		
		// Traversing the element of the map.
		
		for(Map.Entry<Integer, Integer> element:map.entrySet()) {
			System.out.println(element.getKey()+" "+element.getValue());
		}
		
		
	}

}
