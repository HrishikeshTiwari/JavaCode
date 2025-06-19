package Day2;

import java.util.HashMap;
import java.util.Map;

public class FindSingleNumber {

	public static void main(String[] args) {
		/*
		 * Input: nums = [2, 2, 1]  
           Output: 1  
           Input: nums = [4, 1, 2, 1, 2]  
           Output: 4  

		 */
		
		int arr[]= {4,1,2,1,2};
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		
		for(int num:arr) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}
			
			else {
				map.put(num, 1);
			}
			
			
			
		}
       
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
			
		}
	}

}
