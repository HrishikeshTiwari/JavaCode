package Day4;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int arr[]= {100,4,200,1,3,2};
		
		int maxlength=findconsequtive(arr);
		System.out.println(maxlength);

	}
	
	
	public static int findconsequtive(int arr[]) {
		
		int length=arr.length;
		 if(length==0) return 0;
		 
		Set<Integer> set= new HashSet<Integer>();
		
		for(int element:arr) {
			set.add(element);
		}
		
		int maxstreak=0;

		for(int num:set) {
		if(!set.contains(num-1)) {  //  // Check if it's the start of a sequence
			int currentstreak=num;
			int streak=1;	
		
		while(set.contains(currentstreak+1)) {
			currentstreak++;
			streak++;
		}
		maxstreak=Math.max(streak, maxstreak);
		}
		
	}
		return maxstreak;
		

	}
}
