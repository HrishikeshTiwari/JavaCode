package ArrayBasic;

public class ReverseWord {

	public static void main(String[] args) {
		String str="My name is Hrishikesh Tiwari";
		
	/*	String toword[]=str.split("\\s+");
		
		for(int i=toword.length-1;i>=0;i--) {
			
			System.out.println(toword[i]);
			
		}
		
		*/
		
		
		// Another method
		
		StringBuilder sb = new StringBuilder();
		String arr[]=str.split("\\s+");
		
		for(int i=arr.length-1;i>=0;i--) {
			sb.append(arr[i]);

			if(i!=0) {
				sb.append(" ");
			}
			
		}
		System.out.println(sb);
		
	}
}




/*
 * Algorithm
 * 
 * 1. Split the string on the basic of space for that use regular expression (//s+) 
 * 2. after removing the extra space store them in an array
 * 3. after that run the loop to reverse the content of the string
 * 
 */


/*
 * Algorithm 2
 * 
 * you can use string StringBuilder also to perform the above task.
 * 
 * 1. Split the string on the basic of space for that use regular expression (//s+) 
 * 2. after removing the extra space store them in an StringBuilder
 * 3. after that run the loop to reverse the content of the string
 * 
 */