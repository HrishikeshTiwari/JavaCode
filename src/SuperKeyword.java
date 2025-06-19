
public class SuperKeyword {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.sound();

	}

}


class Animal{
	void sound() {
		System.out.println("Animal is making sound");
	}
}


class Dog extends Animal{
	void sound() {
		super.sound();
		System.out.println("Dog is barking");
	}
}
