package stringConceptsAndPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class OccuranceOfEachCharactersInAString {
	static String value;

	public void findingOccuranceUsingHashMap(String value) {

		System.out.println("Enter the String value : ");
		Scanner scanner = new Scanner(System.in);
		String value1 = scanner.next();
		int lengthOfString = value1.length();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < lengthOfString; i++) {
			int count = 1;
			if (!map.containsKey(value1.charAt(i))) {
				map.put(value1.charAt(i), count);
			} else {
				count = map.get(value1.charAt(i));
				map.put(value1.charAt(i), ++count);
			}
		}
		Set<Entry<Character, Integer>> entry = map.entrySet();
		System.out.println(entry);
	}

	public static void main(String[] args) {
		OccuranceOfEachCharactersInAString string = new OccuranceOfEachCharactersInAString();
		string.findingOccuranceUsingHashMap(value);
	}

}
