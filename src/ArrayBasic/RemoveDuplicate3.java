/*
 * 1. Using Extra Space
In this approach, it removes duplicates from an array by sorting it first and then copying the unique elements to a 
temporary array by copying them back to the original array.

Approach:

Create a temporary array temp[] to store unique elements.
Sort the input array first then traverse input array and copy all the unique elements of a[] to temp[]. Also, keep count
 of unique elements. Let this count be j.
Copy j elements from temp[] to a[].
 */



package ArrayBasic;

import java.util.Arrays;

import java.util.Arrays;

public class RemoveDuplicate3 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 3, 5, 6, 7, 8, 5, 8, 8, 8, 8};

        int n = arr.length;

        // Sort the array to make duplicates adjacent
        Arrays.sort(arr);

        int newsize = remove(arr, n);

        for (int i = 0; i < newsize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int remove(int arr[], int n) {
        // Corner case
        if (n == 0 || n == 1) {
            return n;
        }

        // Temporary array
        int temp[] = new int[n];
        int j = 0;

        // Traverse the array and store unique elements in temp
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Adding the last element of the array
        temp[j++] = arr[n - 1];

        // Copy elements back to the original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j;
    }
}

