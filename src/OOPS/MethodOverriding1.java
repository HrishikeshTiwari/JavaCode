package OOPS;

// the process of inheriting the method and changing the implementation of the inherited method is called method overloading.
// while inheriting the access modifier should be same or higher visibility.
// method parameter and return type should be same.



public class MethodOverriding1 {

	public static void main(String[] args) {
		
		Dogg dog= new Dogg();
		dog.Sound();



	}

}

 class Animall{
	 void Sound() {
		 System.out.println("Animal is making the sound");
	 }
 }
 
 
 class Dogg extends Animall{
	 @Override
	 void Sound() {
		 System.out.println("The Dog is baking");
	 }
 }
