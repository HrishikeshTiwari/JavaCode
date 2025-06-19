package Day1ArrayTopics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,2,1,5,6,5};
		
		Set<Integer> set= new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
			
		}
		
		System.out.println(set);

		
		
	}
		

}
