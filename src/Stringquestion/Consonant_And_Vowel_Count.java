package Stringquestion;

public class Consonant_And_Vowel_Count {

	public static void main(String[] args) {

		int vowelcount=0;
		int constcount=0;
     String str="Hrishikesh";
     for(int i=0;i<str.length();i++) {
    	 char ch=str.charAt(i);
    	 
    	 if(ch=='a'|| ch=='e'||ch=='o'||ch=='i'||ch=='u') {
    		 vowelcount++;
    		 
    	 }
    	 else {
    		 constcount++;
    	 }
     }
     
     System.out.println("the vowel count is "+vowelcount+"the number consonant count is "+constcount);

	}

}
