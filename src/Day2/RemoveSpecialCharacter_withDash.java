package Day2;

public class RemoveSpecialCharacter_withDash {

	public static void main(String[] args) {


		String str="Hello@World#Java!";
		String cleanstring=str.replaceAll("[^a-zA-Z0-9]","-");
		System.out.println(cleanstring);

	}

}
