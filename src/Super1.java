
public class Super1 {
	public static void main(String[] args) {
		Cat cat= new Cat();
	}

}

class Aniaml{
	Aniaml(){
		System.out.println("Aniaml constructor");
	}
}

class Cat extends Aniaml{
	Cat(){
		super();  // calling the super class constructor
		System.out.println("Cat class constructor");
	}
}

// super keyword is a reference variable used to refer to the immediate parent class(Suer class) of the current object.
//It is used to access members (fields and methods) of the superclass, and also to invoke the superclass constructor.
//Used in Subclasses: It is used in a subclass to access methods, fields, or constructors of the parent class.

/*super(): Used to call a superclass constructor.

super.method(): Used to call a method of the superclass.

super.field: Used to access a field from the superclass (if not shadowed by the subclass).
*/
