package stringConceptsAndPrograms;

import java.util.Scanner;

public class PalindromeStrings {
	String rev = "";
	static String value;
	
	public String verifyPalindromeString(String value) {
		System.out.println("Enter the String value : ");
		Scanner sc = new Scanner(System.in);
		String value1 = sc.next();
		
		for(int i=value1.length()-1; i>=0; i--) {
			rev = rev + value1.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		
		PalindromeStrings pal = new PalindromeStrings();
		String str = pal.verifyPalindromeString(value);
		
		if(str.equals(PalindromeStrings.value)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}		

	}
}
