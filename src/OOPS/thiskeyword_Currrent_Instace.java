package OOPS;

public class thiskeyword_Currrent_Instace {

	public static void main(String[] args) {
		Automobile at=new Automobile("Tata nano", 2025);
		at.Display();
		

      

	}

}


class Automobile{
     String model;
	int year;
	
	// constructor with parameter
	
	public Automobile(String model, int year) {
		this.model=model;  // 'this.model' refers to the instance variable, 'model' is the parameter
		this.year=year;
	}
	
	public void Display() {
		System.out.println("Model"+this.model+"Year"+this.year);
	}
}
