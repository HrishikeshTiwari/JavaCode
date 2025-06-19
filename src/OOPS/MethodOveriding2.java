//package OOPS;

public class MethodOveriding2 {

	public static void main(String[] args) {

       aanimal dogy=new dog();
       aanimal cat= new Cat();
       dogy.speak();
       dogy.speak("growls");
       cat.speak();
       cat.speak("purrs");

	}

}


class aanimal{
	void speak() {
		System.out.println("the animal is making sound");
	}
	
	void speak(String sound) {
		System.out.println("Animal makes a"+sound+"sound");
	}
}

//Derived class (Subclass)
class dog extends aanimal {
 // Overriding the speak() method
 @Override
 void speak() {
     System.out.println("Dog barks");
 }

 // Overloading the speak() method
 void speak(String sound) {
     System.out.println("Dog " + sound);
 }
}

//Another Derived class (Subclass)
class Cat extends aanimal {
 // Overriding the speak() method
 @Override
 void speak() {
     System.out.println("Cat meows");
 }

 // Overloading the speak() method
 void speak(String sound) {
     System.out.println("Cat " + sound);
 }
}
