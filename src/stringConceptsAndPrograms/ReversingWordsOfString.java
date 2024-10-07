package stringConceptsAndPrograms;

import java.util.Scanner;

public class ReversingWordsOfString {
	static String value;
	static String rev="";

	public void reversingString(String value) {

		System.out.println("Enter the String value : ");
		Scanner scanner = new Scanner(System.in);
		String value1 = scanner.nextLine();
		String[] words = value1.split(" ");
		
		// reversing characters but keeping same word sequence 
		for(String eachWord : words) {
			for(int i=eachWord.length()-1; i>=0; i--) {
				System.out.print(eachWord.charAt(i));
			}
			System.out.print(" ");
		}
		System.out.println(" ");
		// reversing words and character of string
		for(int i=words.length-1; i>=0; i--) {	
			for(int j=words[i].length()-1; j>=0; j--) {
				System.out.print(words[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println(" ");
		// reversing words but keeping same character sequence 
			for(int i=words.length-1; i>=0; i--) {
				System.out.print(words[i]);
					System.out.print(" ");
				}
		
	}	

	public static void main(String[] args) {
		ReversingWordsOfString string = new ReversingWordsOfString();
		string.reversingString(value);
	}

}
