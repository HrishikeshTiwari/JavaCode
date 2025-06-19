package ArrayBasic;

public class Pelingdrome {
	public static void main(String[] args) {
		int n=125;
		int number=n;
		
		int rem=0;
		int result=0;
		
		while(n<0) {
			 rem=n%10;
			 result=result*10+rem;
			 n=n/10;
			
		}
		
		if(number==result) {
			System.out.println("The number is pelindrome ");
		}
		
		else {
			System.out.println("the number is not pelindrome");
		}
		
		
	}

}
