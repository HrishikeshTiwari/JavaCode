
public class Super2 {

	public static void main(String[] args) {
      car c= new car();
      c.start();


	}

}


class vechile {
	void start() {
		System.out.println("Vechile started");
	}
}


class car extends vechile{
	void start() {
		super.start();
		System.out.println("Car is started");
		
	}
}
