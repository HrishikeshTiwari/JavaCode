package ArrayBasic;

public class vowelcount {

	public static void main(String[] args) {

     String str="Hrishikesh Tiwari";
     str=str.toLowerCase();
     
     int result=vowelcount(str);
     System.out.println(result);

	}
	
	public static int vowelcount(String str) {
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch=='a'|| ch=='e'||ch=='o'||ch=='i'||ch=='u') {
				count++;
			}
		}
		return count;
		
	}

}
//No, you cannot use the .equals() method for char in Java because .equals() is a method used for objects (like String), whereas char is a primitive data type.
