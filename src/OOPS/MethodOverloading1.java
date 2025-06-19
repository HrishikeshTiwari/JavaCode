package OOPS;

public class MethodOverloading1 {

	public static void main(String[] args) {
		
		MethodOverloading1 obj= new MethodOverloading1();
		System.out.println("the Addition of two number is"+obj.Add(12, 13));
		System.out.println("the Addition of three number is"+obj.Add(12, 13,12));
		System.out.println("the Addition of two float  number is"+obj.Add(12.5, 13.5));


	}
	
	
	public int Add(int a, int b) {
		return a+b;
	}
	
	public int Add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double Add(double a, double b) {
		return a+b;
	}
	

}
