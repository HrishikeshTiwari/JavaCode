

/* Shifting 0 at the end of the array. 
 * 
 * Brute force Approach
 * In this approach, we will traverse the whole array and will count the number of zeros present in
 * the array. While counting we will delete the zero from the array.
After completing the above process, we will push back the count number of zeros into the array

to perform the process it will be recommended to change the array into list which will help in removing the 
element of the array.

 */

package ArrayBasic;

import java.util.ArrayList;
import java.util.Arrays;

public class ShiftingZeroAtEnd {

	public static void main(String[] args) {
		int arr[]= {1,2,03,0,5,0,7,8,0};
		
		ArrayList<Integer>lst= new ArrayList <>();
		
		 // Convert int[] to List<Integer> and storing the array element into arraylist

        for (int num : arr) {
            lst.add(num);
        }
		
		shifting(lst);
		

	}
	
	public static void shifting(ArrayList<Integer> lst) {
		int count=0;
		for(int i=0;i<lst.size();i++) {
			if(lst.get(i)==0) {
				count++;
				lst.remove(i);
				i--;
			}
			
		}
		
		for(int i=0;i<count;i++) {
			lst.add(0);
		}
		
		// printing the elmenet after shifting
		System.out.println("element after shifting the 0");
		for(int i=0;i<lst.size();i++) {
			System.out.print(lst.get(i)+" ");
		}
	}

}
