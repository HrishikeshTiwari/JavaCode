package ArrayBasic;
// Union of two sorted Array.

import java.util.*;

class TUF{
	static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
		
		int i = 0, j = 0; // pointers
		ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
		
		while (i < n && j < m) {
			
		    if (arr1[i] == arr2[j]) {
		        if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
		            Union.add(arr1[i]);
		            
		        }
		        
		        i++;
		        j++; // Explicitly increment both pointers when arr1[i] == arr2[j]
		        
		    }
		    else if (arr1[i] < arr2[j]) {
		        if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
		            Union.add(arr1[i]);
		        }
		        
		        i++;
		    } 
		    else {
		        if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
		            Union.add(arr2[j]);
		        }
		        
		        j++;
		    }
		}

		return Union;
	}
	public static void main(String args[]) {
		int n = 10, m = 7;
		int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int arr2[] = {2, 3, 4, 4, 5, 11, 12};
		ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
		System.out.println("Union of arr1 and arr2 is ");
		for (int val: Union)
			System.out.print(val+" ");
	}
}

/*
 * Explanation:
Purpose of the Check:

This line ensures that duplicate elements are not added to the Union list. Specifically, it checks whether the last element 
currently in the Union list (Union.get(Union.size() - 1)) is not equal to the current element being considered from arr1 (arr1[i]).

How It Works:

Union.get(Union.size() - 1):
Retrieves the last element of the Union list. The method Union.size() returns the number of elements in the list, 
and subtracting 1 gives the index of the last element.
arr1[i]:
Represents the current element in arr1 being processed.
!=:
Compares the two values to check if they are different. If they are not equal, the condition evaluates to true.

Action Taken:

If the condition Union.get(Union.size() - 1) != arr1[i] evaluates to true, it means that the current element in arr1 
is not a duplicate of the last element in the Union list, so the element is added to the Union list using Union.add(arr1[i]).
 */




