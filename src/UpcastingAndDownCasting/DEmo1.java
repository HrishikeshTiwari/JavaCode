package UpcastingAndDownCasting;

public class DEmo1 {

    public static void main(String[] args) {
        
        // Upcasting: Dog object is treated as an Animal
        Animal an = new Dog();
        an.Eat();  // Outputs: Dog is Eating the bones (due to polymorphism)
        
        // Downcasting: Animal reference is cast back to Dog
        Dog d = (Dog) an;
        d.Eat();  // Outputs: Dog is Eating the bones
    }

}

class Animal {
    
    public void Eat() {
        System.out.println("Animal is Eating");
    }
}

class Dog extends Animal {
    
    @Override
    public void Eat() {
        System.out.println("Dog is Eating the bones");
    }
}
