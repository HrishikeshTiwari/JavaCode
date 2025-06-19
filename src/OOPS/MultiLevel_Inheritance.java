package OOPS;

public class MultiLevel_Inheritance {
	public static void main(String[] args) {
		Department d= new Department();
		System.out.println(d.Department);
		d.ConductExam();
		d.conduct_Internal();
		System.out.println(d.name);
		d.Assignment();
		
	}
    
	

}

class University{
	void ConductExam() {
		System.out.println("Vtu is conducting the exam ");
	}
}

class College extends University{
	String name="KIT";
	void conduct_Internal() {
		System.out.println("College is conducting internal");
	}
}

class Department extends College{
	String Department="CA";
	void Assignment() {
		System.out.println("CA deprtment is preparing Assigment");
	}
}
