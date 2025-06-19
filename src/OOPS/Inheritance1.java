package OOPS;

// Single Level Inheritance.


public class Inheritance1 {

	public static void main(String[] args) {
		
		Father f= new Son();   // Up casting
		System.out.println(f.Name);
		
		Son s= (Son) f;  // Down Casting
		
		
	     System.out.println(s.Name+" "+s.age);

	}

}

class Father{
	String Name="Smith";
	
}

class Son extends Father{
	int age=20;
	
}
