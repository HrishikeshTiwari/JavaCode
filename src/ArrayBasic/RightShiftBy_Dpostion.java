package ArrayBasic;

public class RightShiftBy_Dpostion {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5,6,7,8};
		int n=arr.length;
		int d=3;
		
		shift(arr,n,d);
		
System.out.println("The element of the array after right roation");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	
	
	public static void shift(int arr[], int n, int d) {
		
		d=d%n;
		reverse(arr,0,n-1);
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);

		
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

/*
 * 
 * Algorithm
 * 1.Reverse the entire array:(reverse(arr,0,n-1));
 * 2. Reverse the first d elements (reverse(arr,0,d-1));
 * 3.Reverse the remaining n-d elements (reverse(arr,d,n-1));
 * 
 */
