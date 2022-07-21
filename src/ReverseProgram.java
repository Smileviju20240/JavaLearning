
public class ReverseProgram {

	public static void main(String[] args) {

		String str = "levels";
		String rev = "";

		for (int i = str.length()-1; i >= 0 ; i--) {
			
			rev = rev+str.charAt(i);
		}
			if(str.equals(rev)) 
				System.out.println("Yes, Palidrome");
			else
				System.out.println("No, not a palindrome");
			
	}

}
