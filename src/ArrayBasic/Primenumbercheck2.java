package ArrayBasic;

import java.util.Scanner;

public class Primenumbercheck2 {

	public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the number which you want");
     int n= sc.nextInt();
     int count=0;
     
    
     
     if(n<=1) {
    	 System.out.println("Opps! please enter the number greater than 1");
    	 
     }
     
     if(n==2) {
    	 System.out.println("the number is prime");
     }
     
     for(int i=2;i<n;i++) {
    	 
    	 if(n%i==0) {
    		 count++;
    	 }
    	 
     }
     
     if(count>0) {
    	 System.out.println("the given number is not prime");
     }
     else {
    	 System.out.println("the provided number is prime");
     }
    	 

	}

}
