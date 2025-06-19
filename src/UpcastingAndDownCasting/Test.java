package UpcastingAndDownCasting;

public class Test {

	public static void main(String[] args) {
		vechile v=new car();  // Upcasting
		System.out.println(v.brand);
		v.start();
		// with Upcasted reference we can access only super class member.
		// with downcasted reference we can access both super class as well as subclass member.
		
		car c= (car) v; // Downcasting
		System.out.println(c.brand);
		System.out.println(c.color);
		c.start();
		c.stop();
		

	}

}


class vechile{
	String brand="Suzuki";
	void start() {
		System.out.println("Vechile is started");
	}
}


 class car extends vechile{
	String color="Black";
	
	void stop() {
		System.out.println("the car is stopped");
	}
	
}

