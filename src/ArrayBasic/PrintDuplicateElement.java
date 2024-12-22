package ArrayBasic;

import java.util.HashSet;

//public class PrintDuplicateElement {
//
//	public static void main(String[] args) {
//
//     int arr[]=  {1, 2, 3, 4, 2, 7, 8, 8, 3}; 
//     
//		
//     
//     for(int i=0;i<arr.length;i++) {
//    	 for(int j=i+1;j<arr.length;j++) {
//    		 if(arr[i]==arr[j]) {
//    			 System.out.print(arr[i]+" ");
//    			break;
//    			
//    		 }
//    	 }
//     }
//
//	}
//
//}
// the problem with this program is it print the duplicate element multiple time. so we will not consider this

//public class PrintDuplicateElement {  
//    public static void findDuplicates(int[] array) {  
//        HashSet<Integer> seen = new HashSet<>();  
//        for (int num : array) {  
//            if (!seen.add(num)) {  
//                System.out.println("Duplicate element found: " + num);  
//            }  
//        }  
//    }  
//    public static void main(String[] args) {  
//        int[] array = {4, 5, 6, 7, 5,4,4,6,5,5, 6};  
//        findDuplicates(array);  
//    }  
//}  