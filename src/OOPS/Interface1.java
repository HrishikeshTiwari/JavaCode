package OOPS;

public class Interface1 {
	public static void main(String[] args) {
		person p= new Anshu();
		System.out.println(p.age);
		p.Eat();
		
		
		
	}

}

interface person{
	void Eat();
	int age=25;
}

 class Anshu implements person{
	@Override
	public void Eat() {
		System.out.println("Eating viryani");
	}
	
}
 
 //In Java, only one public class is allowed per .java file, and the file name must match the name of the public class.

//So if your file is named Interface1.java, then only Interface1 can be public.
 
