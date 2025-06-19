package ArrayBasic;

public class TogglecaseofCharacter {

	public static void main(String[] args) {
		
		String str= "Hrishikesh";
		
		StringBuilder sb= new StringBuilder();
		
	     for(int i=0;i<str.length();i++) {
	    	 
	    	char ch= str.charAt(i);
	    	
	    	if(ch>='A' && ch<='Z') {
	    		sb.append(Character.toLowerCase(ch));
	    	}
	    	
	    	
	    	else if (ch>='a' && ch<='z') {
	    		sb.append(Character.toUpperCase(ch));
	    	}
	    	
	    	else {
	    		sb.append(i);
	    	}
	    	 
	    	
	     }
	     
	     System.out.println(sb);

	}

}
