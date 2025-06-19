package Stringquestion;

public class ReverseSentence {

	public static void main(String[] args) {

       String str="My name is Hrishikesh";
       
       String[] word=str.split("\\s+");
       
       for(int i=word.length-1;i>=0;i--) {
    	   System.out.print(word[i]+" ");
       }

	}

}
