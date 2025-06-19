package Day2;

/*
 * Algorithm
 * Take input array and Target
Initialise start = 0 and end = (array size -1)
Intialise mid variable
mid = (start+end)/2
if array[ mid ] == target then return mid
if array[ mid ] < target then start = mid+1
if array[ mid ] > target then end = mid-1
if start<=end then goto step 5
return -1 as Not element found
 */

public class BinarySearch {

    public static void main(String[] args) {
        /*
         * Input: arr = [1, 3, 5, 7, 9, 11, 15], target = 7
         * Output: Index 3
         */

        int arr[] = {1, 3, 5, 7, 9, 11, 15};
        int target = 5;
        int result = Binarysearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int Binarysearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Correct calculation of mid
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;  // Return the index if the element is found
            } else if (target > arr[mid]) {
                start = mid + 1;  // If target is greater, ignore left half
            } else {
                end = mid - 1;  // If target is smaller, ignore right half
            }
        }
        return -1;  // Return -1 if the element is not found
    }
}

//Here, start + end will exceed Integer.MAX_VALUE, causing an overflow.

//Instead, we use start + (end - start) / 2, which avoids overflow.
