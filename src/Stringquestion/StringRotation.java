package Stringquestion;


/*
 * Explanation:
Input Validation: If the lengths of str1 and str2 are different, they can't be rotations of each other, so the program immediately returns false.
Concatenation Trick: The program concatenates str1 with itself, creating a string that contains all possible rotations of str1 as its substrings.
Substring Check: It checks if str2 is a substring of the concatenated string. If it is, then str2 is a rotation of str1.
 */

public class StringRotation {

	public static void main(String[] args) {
		
		String str1="Hello";
		str1=str1.toLowerCase();
		String str2="lohel";
		str2=str2.toLowerCase();
		
		if(checkingRotation(str1,str2)){
			System.out.println("The String is rotation of each other");
		}
		else {
			System.out.println("The string is not rotation of each other");
		}

     

	}
	
	public static  boolean checkingRotation(String str1,String str2) {
		
		if(str1.length()!=str2.length()){
			return false;
		}
		
		String concat=str1+str1;
		
		return concat.contains(str2);
			
		
		
	}

}
