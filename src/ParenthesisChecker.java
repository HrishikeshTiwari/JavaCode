
/*
 *Input: s = "[{()}]"
Output: true
Explanation: All the brackets are well-formed.
 */

import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
	
		String str="[{()}]";
		
		if(checker(str)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		

	}
	
	public static boolean checker(String str) {
		Stack<Character> stack= new Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
		  char ch=str.charAt(i);
		  if(ch=='{'|| ch=='['|| ch=='(') {
			  stack.push(ch);
		  }
		  else {
              if (stack.isEmpty()) return false;
 
		 
			  char top=stack.pop();
			  if((ch == ')' && top != '(') ||
	                    (ch == '}' && top != '{') ||
	                    (ch == ']' && top != '[')) {
				  return false;
			  }
					
		  
		}
	

}
		 return stack.isEmpty();
}
}
