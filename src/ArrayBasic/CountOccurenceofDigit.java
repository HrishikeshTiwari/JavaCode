/*
 * Algorithm: -
Step1. Declare the data and convert that int data into array so that we will be able to traverse the digit.
2. while converting from int to array first convert the int into String and then change into charArray. Eg. String.ValueOf(n).toCharArray().
3. Now declare the variable count =0 for counting the digit. 
4.Since we have to count the occurrence of digit then we can use Map which will store the value as a key and count as a value. While declaring Map using Linked HashMap class because it does not store the duplicate the key.

 */


package ArrayBasic;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurenceofDigit {

	public static void main(String[] args) {

		int n=1213452561;
		char arr[]= String.valueOf(n).toCharArray();

		int count=0;
		digitcount(arr);
	}

	public static void digitcount(char arr[]) {

		Map<Object, Integer> map= new LinkedHashMap<>();
		int count=0;
		for(int i=0;i<arr.length;i++){
			count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}

			}
			map.put(arr[i],count);
		}
		System.out.println(map);


	}

}
