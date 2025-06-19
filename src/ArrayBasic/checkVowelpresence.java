package ArrayBasic;

public class checkVowelpresence {

	public static void main(String[] args) {


		String str="Hrishikesh";
		boolean flag=false;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.toLowerCase().charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='o'||ch=='u' || ch=='i' ) {
				flag=true;
				break;
			}	
			
		}
		 if(!flag) {
			System.out.println("The string does not contain a vowel");
			
		}
		 else {
			 System.out.println("The string  contain a vowel");
		 }
		
			
			

	}

}
