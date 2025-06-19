package OOPS;

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		 // Creating objects of the subclasses
        Dog dog = new Dog();
        cat cat = new cat();
        
        dog.Bark();
        dog.eat();
        dog.sleep();
        
        cat.meow();
        cat.eat();
        cat.sleep();

        

	}

}

class Animal {
	
	void eat() {
		System.out.println("The animal is eating the food");
	}
	
	
	void sleep() {
		System.out.println("the Animal is sleeping");
	}
	
}

class Dog extends Animal{
	void Bark() {
		System.out.println("the Dog is barking");
	}
}


class cat extends Animal {
	void meow() {
        System.out.println("The cat meows.");
    }
	
}


