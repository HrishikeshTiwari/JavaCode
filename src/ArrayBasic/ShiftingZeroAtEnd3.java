

package ArrayBasic;

/*
 * Algorithm
 * 1. in this approach we will declare a variable named count=0 after that traverse the whole array.
 * 2. and will check if the element is non zero then we will add in the arr[count++] and will increment count;
 * 3. after that all the zero will come at the begning of the array and now try to add the non zero element add the end
 * 4. for that run a while loop and check the condition. while(count<n) where count is no of non zero element and n is the size of the array.
 * and then keep on adding 0 until it reach the size of the array.
 *  */
public class ShiftingZeroAtEnd3 {

	public static void main(String[] args) {

    int arr[]= {1,2,0,3,0,4,5,0,6,0};
    int n=arr.length;
    int count=0;
    
    for(int i=0;i<n;i++) {
    	if(arr[i]!=0) {
    		arr[count++]=arr[i];
    	}
    }
    while(count<n) {
    	arr[count++]=0;
    }
    
    // printing the element after shifting the zero at the end of the aaray
    
    for(int i=0;i<n;i++) {
    	System.out.print(arr[i]+" ");
    }

	}

}
