package ArrayBasic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
public class Sum_of_Distinct_Numbers {

	public static void main(String[] args) {

		 int[] arr = {1, 2, 2, 3, 4, 4, 5};
		 int sum=0;
		 
		 Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		 
		 for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
			}

		 
		 // Traversing the map elment
		 
		 for(Map.Entry<Integer, Integer> element:map.entrySet()) {
			 if(element.getValue()==1) {
				 sum+=element.getKey();
			 }
		 }
		 
		 System.out.println("The sum of the distinct element of the array is \n"+sum);

}
}

*/


// We can solve this question using set also.

public class Sum_of_Distinct_Numbers {

	public static void main(String[] args) {
		
		 int[] arr = {1, 2, 2, 3, 4, 4, 5};
		 int sum=0;
		 Set<Integer> set= new HashSet<Integer>();
		 
		 /*
		 for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
				sum+=arr[i];
			}
		 }
		 */
		 
		 // Or since we know that set contains only uniqueue element so we do not need to check.
		 for (int i = 0; i < arr.length; i++) {
			    if (set.add(arr[i])) {
			        sum += arr[i];
			    }
			}
		 
		 System.out.println("The sum of the distinct element of the array is \n"+sum);
		 
		
	}
}