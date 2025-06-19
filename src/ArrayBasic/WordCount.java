package ArrayBasic;

public class WordCount {

	public static void main(String[] args) {
		
		String str="Welcome to java   programming";
		int count=0;
		
		if(str==null || str.trim().isEmpty()) {
			System.out.println("No word in the sentece ");
			return ;
			
		}
		
		String arr[] = str.trim().split("\\s+");
		
		System.out.println(arr.length);
		
		

}
}


//   \\s refers to whitespace characters (like spaces, tabs, and newlines). This is the escape sequence 
//for whitespace characters in a regular expression.

//The + after \\s means one or more whitespace characters. So, \\s+ will match one or more consecutive whitespace characters in the string.