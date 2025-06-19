package Day1ArrayTopics;

import java.util.HashSet;
import java.util.Set;

public class UnionofTwoArray {

	public static void main(String[] args) {
	
		int arr1[]= {1,2,3,4,5,6,7,8};
		int arr2[]= {6,7,8,9};
		
		Set<Integer> set= new HashSet<Integer>();
		
		for(int n:arr1) {
			set.add(n);
		}
		
		for(int n:arr2) {
			set.add(n);
		}
		
       System.out.println("The union of two array is"+set);
	}

}
