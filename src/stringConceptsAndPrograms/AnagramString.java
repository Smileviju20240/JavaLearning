package stringConceptsAndPrograms;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		String str1 = "care";
		String str2 = "race";
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(String.valueOf(arr1).equals(String.copyValueOf(arr2))) {
			System.out.println("Anagram");
		}else
			System.out.println("Not anagram");

	}

}
