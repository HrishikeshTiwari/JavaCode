package ArrayBasic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number which you want");
		int n=sc.nextInt();
		fibonacci(n);

	}
	
	public static void fibonacci(int n) {
		int a=0,b=1;
		System.out.println("fibonacci series"+a+" "+b);
		
		for(int i=2;i<n;i++) {
			int next=a+b;
			System.out.println(next);
			a=b;
			b=next;
		}
	}

}
