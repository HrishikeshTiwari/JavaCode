package OOPS;

public class Interface_swiggy {

	public static void main(String[] args) {
		//paytm c= new customer();
//or
		customer c= new customer();
		c.orderfoood();
		c.payment();
		



	}

}

interface swiggy{
	void orderfoood();
}

interface paytm extends swiggy{
	void payment();
}

class customer implements paytm{
	@Override
	 public void orderfoood() {
		System.out.println("Order sandwich");
		
	}
	@Override
	public void payment() {
		System.out.println("Doing payment");
	}
	
}
