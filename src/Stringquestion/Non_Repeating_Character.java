package Stringquestion;

public class Non_Repeating_Character {

    public static void main(String[] args) {
        // Step 1: Initialize the string
        String str = "Swiss"; 
        
        // Step 2: Convert the string to lowercase to make the search case-insensitive
        str = str.toLowerCase(); 
        
        // Step 3: Loop through the string to check each character
        for (int i = 0; i < str.length(); i++) {
            
            // Step 4: Check if the current character appears only once in the string
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                // Step 5: If true, print the non-repeating character and break out of the loop
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}


/*
Explanation:
The indexOf method gives you the first occurrence of the character.

The lastIndexOf method gives you the last occurrence of the same character.
If the first occurrence index is the same as the last occurrence index, it means that the character appears only once in the string,
 making it a non-repeating character.
 
 
 Explanation:
The indexOf method gives you the first occurrence of the character.

The lastIndexOf method gives you the last occurrence of the same character.

Now, the condition if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) checks if the first occurrence and last occurrence of the
 character at position i are the same. If they are equal, this means that the character appears only once in the string.
  If they are different, this means the character appears more than once in the string.

*/

