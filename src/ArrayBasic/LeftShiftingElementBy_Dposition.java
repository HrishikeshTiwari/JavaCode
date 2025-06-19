package ArrayBasic;

public class LeftShiftingElementBy_Dposition {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8};
		int d=3;
		int n=arr.length;
		
		shift(arr,d,n);
		
		System.out.println("The element of the array after roation");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void shift(int arr[],int d, int n) {
		
		if(n==0) return;
		
		d=d%n;
		
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);

		
	}
	
	public static void reverse(int arr[], int start,int end) {
		
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}

}

//TimeComplexity:= 0(2n)
//Space complexity:- 0(1)







/*
 * Algorithm 
 * 1. Reverse the Subarray with first D element (Reverse(arr, 0,D-1))
 * 2. Reverse the last D element (Reverse(arr,d,n-1)
 * 3. Reverse the Whole array (arr,0,n-1))
 * 
 * 
 * when D is more than the size of the array in that case to find the D element
 * D= D%n;
 * 
 */
