package Day1ArrayTopics;

import java.util.HashMap;
import java.util.Map;

public class Element_Morethan_Nby2 {

	public static void main(String[] args) {


		/*
		 * Input: arr = [3, 3, 4, 2, 3, 3, 3, 5, 3]  
           Output: 3  
           Explanation: 3 appears 5 times, which is more than 9/2 = 4.5
		 */
		
		 int arr[] = {3, 3, 4, 2, 3, 3, 3, 5, 3};
		 int n=arr.length;
		 Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		 
		 for(int el:arr) {
			 map.put(el, map.getOrDefault(el, 0)+1);
		 }
		 
		/*
		 for(int element:arr) {
			 if(map.get(element)>arr.length/2) {
				 System.out.println("the element appear more than N/2 time is+"+" "+element);
				 break;
			 }
		 }
		 */
		 
		 // Another way by traversing the map 
		 
		 for(Map.Entry<Integer, Integer> element: map.entrySet()) {
			 if(element.getValue()>n/2) {
				 System.out.println("the element appear more than N/2 time is"+element.getKey());
			 }
		 }

	}

}
