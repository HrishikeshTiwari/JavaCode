package Day2;

public class HidingSesitiveInfo {

	public static void main(String[] args) {

		// Masking Phone Number
		String phone = "My number is 98765-43210";
		String mask= phone.replaceAll("[0-9]", "*");
		System.out.println(mask);
		

	}

}
