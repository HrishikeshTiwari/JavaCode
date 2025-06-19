package Day2;

public class RotationofString {

	public static void main(String[] args) {

     String str="Hrishikesh";
     int d=2;
     str=Shifting(str,d);
     
     System.out.println("String after Rotstion");
     System.out.println(str);
    
     
     

	}
	
	
	public static String Shifting(String str, int d) {
		
		char[] ch=str.toCharArray();
		int n=str.length();
		
		d=d%n;
		reverse(ch,0,d-1);
		reverse(ch,d,n-1);
		reverse(ch,0,n-1);
		
		return new String(ch);
		
		
	     
		
	}
	
	private static void reverse(char[] arr, int start, int end) {
		
		while(start<end) {
			
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
	}
	}

//The above method performs a Left Rotation (Anti-clockwise) of the string.



	


