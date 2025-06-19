package OOPS;

public class thiskeyword_Calling_constructor {

	public static void main(String[] args) {
    car c= new car("Tesla");
    c.display();
      

	}

}

class car{
	String model;
	int year;
	
	public car(String model, int year) {
		this.model=model;
		this.year=year;
	}
	
	public car(String model) {
		
		this(model,2020);
	}
	
	void display() {
		System.out.println("Model is"+model+" year is"+year);
	}
}

//In this example, the constructor with one parameter calls the constructor with two parameters using this(model, 2020)
//to provide default year value 2020 when only the model is given.
