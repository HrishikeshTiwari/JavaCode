package Day1ArrayTopics;

public class ShiftingByDPosition {

	public static void main(String[] args) {


		int arr[]= {1,2,3,4,5,6,7,8};
		int d=2;
		shift(arr,d);

	}
	
	
	public static void shift(int arr[], int d) {
		int n=arr.length;
		d=d%n;
		
		reverse(arr,0,d);
		reverse(arr,d+1,n-1);
		reverse(arr,0,n-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	public static void reverse(int arr[], int start, int end) {
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
					
		}
	}

}
