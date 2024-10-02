package stringConceptsAndPrograms;

import java.util.Scanner;

public class reversingString {
	static String value;
	static String rev="";

	public void reversingString(String value) {

		System.out.println("Enter the String value : ");
		Scanner scanner = new Scanner(System.in);
		String value1 = scanner.next();
		int lengthOfString = value1.length();
		//nayantara
		
		for(int i=lengthOfString-1; i>=0; i--) {
			rev = rev + value1.charAt(i);
		}
		System.out.println(rev);
	}	

	public static void main(String[] args) {
		reversingString string = new reversingString();
		string.reversingString(value);
	}

}
