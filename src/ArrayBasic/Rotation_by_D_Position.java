/*Rotation of the array by D position
 * first store the element from index D to N-1 into a temporary array
 * then store first d element of original array into temp array.
 * copy back the element from temp array to original array.
 * 
 * 
 */

package ArrayBasic;

public class Rotation_by_D_Position {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5,6,7,8};
		int d=3;
		int n=arr.length;
		
		rotate(arr,d);
		printArray(arr,n);

	}
	
	public static void rotate(int arr[], int d) {
		
		int temp[]= new int[arr.length];
		int k=0;
		for(int i=d;i<arr.length;i++) {
			temp[k++]=arr[i];
		}
		
		for(int i=0;i<d;i++) {
			temp[k++]=arr[i];
		}
		
		// coping the temp array into original array
		
		for(int i=0;i<k;i++) {
			arr[i]=temp[i];
		}
	
	}
	 public static void printArray(int arr[], int n) {

			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			
		}
	
	

}
