package stringConceptsAndPrograms;

public class capitalizeWords {

	public static void main(String[] args) {

		String input = "welcome to geeksforgeeks";
		String[] words = input.split("\\s");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			// capitalize the first letter, append the rest of the word, and add a space
			result.append(Character.toTitleCase(word.charAt(0)))
			      .append(word.substring(1))
			      .append(" ");
		}
		System.out.println(result.toString());
	}

}
