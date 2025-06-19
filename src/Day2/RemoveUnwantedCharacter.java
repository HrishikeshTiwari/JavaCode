package Day2;

public class RemoveUnwantedCharacter {

	public static void main(String[] args) {
		
		/*
		 * Using replaceAll() with Regular Expressions
          If you need to remove specific characters (e.g., special symbols, numbers, etc.), use regex.
          If you need to remove multiple unwanted characters, use replaceAll()
          If you're removing a specific character, use replace().
          replaceAll(String regex, String replacement) replaces all matches of the regex pattern in the string with the given replacement (which is "", meaning removal).
          Parameters:

        regex: the regular expression to which this string is to be matched.
        replace_str: the string which would replace found expression.
		 */
	 
		 String str = "He@llo! Wo#rld123";
		 String cleanstring= str.replaceAll("[^a-zA-Z]", "");
		 System.out.println(cleanstring);
		 

	}

}
