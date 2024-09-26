package collectionConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class OccuranceOfDuplicateCharactersInAString {
	static String value;

	public void findingOccuranceUsingHashMap(String value) {

		System.out.println("Enter the String value : ");
		Scanner scanner = new Scanner(System.in);
		String value1 = scanner.nextLine().replaceAll("[^a-zA-Z]", "");
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
		for(Entry<Character, Integer> eachEntry : entry) {
			if(eachEntry.getValue() > 1) {
				System.out.println(eachEntry.getKey()+ " -> " +eachEntry.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		OccuranceOfDuplicateCharactersInAString string = new OccuranceOfDuplicateCharactersInAString();
		string.findingOccuranceUsingHashMap(value);
	}

}
