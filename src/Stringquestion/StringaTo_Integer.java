package Stringquestion;

public class StringaTo_Integer {

	public static void main(String[] args) {
		
		String str="12345";
		if(str instanceof String) {
			System.out.println("str is string data type");
		}
		System.out.println(str);
		int num=Integer.parseInt(str);
		
		/*
		  Integer num=Integer.parseInt(str);
		  if(num instanceof Integer) {
			  System.out.println("num is integer data type");
		  }
		  
		  */
		 
	
		
       
		System.out.println(num);
		

	}

}

/*
 * Converting a String to an Integer in Java can be done using multiple approaches. 
 * The most common methods include using the Integer.parseInt() method or Integer.valueOf() method.
 * The Integer.parseInt() method is the most common and straightforward way to convert a string to an integer.
 */

// instaceof operator does not work with primitive data type. if you want to check the data type then convert them into non primitive.
/*
 * Integer num=Integer.parseInt(str);
 * if(num instaceof Integer)
 */
