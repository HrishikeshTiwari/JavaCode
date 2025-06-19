package ArrayBasic;

public class proveStringisImmutable {

	public static void main(String[] args) {
		
		String str1="Hrishikesh";
		
		// assigning the reference of string str1 to string str2   
		String str2 = str1;   
		
		str1=str1+"Hrishikesh";
		
		
		if(str1==str2) {
			System.out.println("The string is immutable");
		}
		
		else {
			System.out.println("the string is not immutable");
		}

	}

}
