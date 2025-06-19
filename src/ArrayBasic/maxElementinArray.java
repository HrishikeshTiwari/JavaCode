package ArrayBasic;

public class maxElementinArray {

	public static void main(String[] args) {

     int arr[]= {1,3,5,7,12,19};
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++) {
    	  
    	  if(arr[i]>max) {
    		  max=arr[i];
    	  }
    	  
    	  if(arr[i]<min) {
    		  min=arr[i];
    	  }
      }
      
      System.out.println("the maximum element in the array is"+max);
      System.out.println("the minimum element in the array is"+min);

	}

}

// the time complexity is o(n).
