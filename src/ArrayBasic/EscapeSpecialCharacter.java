package ArrayBasic;

public class EscapeSpecialCharacter {

	public static void main(String[] args) {
		
		/*
		 *  /"Hello"/
		 *  /'Hello'/
		 *   '/'Hello'/'
		 *   "/'Hello'/"
		 *  "Hello"
		 *  I love "Java" programming "Language".
		 */
		
		// we want to print the above sentence exactly the same way.
		
		System.out.println("/\"Hello\"/");   // here backslash is escape sequence or escape character.  / forward slash , 
		System.out.println("/\'Hrishikesh\'/");
		System.out.println("\"Hello\"");
		System.out.println("'/\'Hello'/\'");
		System.out.println("\"/'Hello'/\"");
		
		System.out.println("I love \"Java\" programming \"Language\"");

	}

}


// always use the backslash before the word or character on which you want to apply some special character.