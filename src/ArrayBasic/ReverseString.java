package ArrayBasic;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Baban";
		
		/*
		
		char[] ch=str.toCharArray();  // this we are doing because string is immutable.
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		*/
		
		
		//Another way
		char[] ch=str.toCharArray();
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=ch.length-1;i>=0;i--) {
			sb.append(ch[i]);
		}
		
		System.out.println(sb);

	}

}
