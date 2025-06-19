package Stringquestion;

public class Print_First_Letter_of_Each_Word {

	public static void main(String[] args) {

     String str="My name is Khusbu";
    String words[]= str.split("\\s+");
    
   for(String word:words) {
	   for(int i=0;i<word.length();i++) {
		   System.out.print(word.charAt(i));
		   break;
		  
	   }
   }

	}

}
