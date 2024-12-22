
/*
 * The simplest method to remove duplicates from an array is using a Set, which automatically eliminates duplicates. 
 * This method can be used even if the array is not sorted.
 * 
 * HashSet, LinkedHashSet and TreeSet are the implementations of Set interface which does not allow duplicate elements.
 * LinkedHashMap and LinkedHashSet maintains the insertion order
 */





package ArrayBasic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate2 {

	public static void main(String[] args) {
		int arr[]= {5,5,6,1,1,2,3,2};
		
		Set<Integer> set= new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
			
		}
		System.out.println(set);

	}

}
