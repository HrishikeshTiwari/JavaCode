package Stringquestion;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the string which you want");
    String str=sc.nextLine();
    String word[]=str.split("\\s+");
    String result="";
    
    for(String words:word) {
    	char arr[]=words.toCharArray();
    	String reverse="";
    	
    	for(int i=arr.length-1;i>=0;i--) {
    		
    		reverse+=arr[i];
    		
    		
    	}
    	result+=reverse+" ";
    }
    System.out.println(result);
    
    
    
   
	}

}
