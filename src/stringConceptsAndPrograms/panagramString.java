package stringConceptsAndPrograms;

import java.util.HashSet;
import java.util.Set;

public class panagramString {

	public static void main(String[] args) {

		String input = "The quick brown fox jumps over the lazy dog";
		Set<Character> set = new HashSet<>();
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				set.add(input.charAt(i));
			} else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				set.add(Character.toLowerCase(input.charAt(i)));
			}
		}

		if (set.size() == 26) {
			System.out.println("Given string is panagram");
		} else
			System.out.println("Given string is not panagram");
	}

}
