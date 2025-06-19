package Stringquestion;

public class Allsubstring_of_String {

	public static void main(String[] args) {

     String str1="abc";
     
     for(int i=0;i<str1.length();i++) {
    	 
    	 for(int j=i+1;j<=str1.length();j++) {
    		 System.out.println(str1.substring(i,j));
    	 }
     }

	}

}
