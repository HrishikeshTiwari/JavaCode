package Day2;

public class Pelingdrome {

	public static void main(String[] args) {

       int num=126;
       int number=num;
       int sum=0;
       int rem=0;
       while(num>0) {
    	   rem=num%10;
    	  sum=sum*10+rem;
    	  num=num/10;
       }
       if(number==sum) {
    	   System.out.println("The number is pelingdrome");
    	   
       }
       
       else {
    	   System.out.println("the number is not pelingdrome");
       }

	}

}
