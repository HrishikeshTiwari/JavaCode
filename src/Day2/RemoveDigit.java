package Day2;

public class RemoveDigit {

	public static void main(String[] args) {
		
		String str="My Name is Hrishikesh 1296";
		String Cleandigit= str.replaceAll("[0-9]","");
		System.out.println(Cleandigit);

	}

}
