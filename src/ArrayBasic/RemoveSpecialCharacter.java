package ArrayBasic;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {

     String str="D!iw*a@l!i";
     
     for(int i=0;i<str.length();i++) {
    	 
    	 char ch=str.charAt(i);
    	 
    	 if(ch>='A' &&  ch<='Z' || ch>='a' &&  ch<='z' ) {
    		 System.out.print(ch);
    		 
    	 }
     }

	}

}
