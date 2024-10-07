package stringConceptsAndPrograms;

import java.util.HashSet;
import java.util.Set;

public class MissingCharactersInString {

	public static void main(String[] args) {

		String input = "My name is Vijay Dhage";
		Set<Character> presentChars = new HashSet<Character>();
		StringBuilder missingChars = new StringBuilder();

		// add each character of above string to the set
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				presentChars.add(input.charAt(i));
			} else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				presentChars.add(Character.toLowerCase(input.charAt(i)));
			}
		}

		// check which characters are missing
		for (char c = 'a'; c < 'z'; c++) {
			if (!presentChars.contains(c)) {
				missingChars.append(c);
			}
		}
		System.out.println(missingChars);
	}

}
