package stringConceptsAndPrograms;

import java.util.HashSet;
import java.util.Set;

public class findingLongestSubstringWithoutCharacterRepetation {

	public static void main(String[] args) {
		
		String str = "abcdbare";
		Set<Character> set = new HashSet<>();
		String temp = "";
		String longestSubString = "";
		
		for(int i=0; i<str.length(); i++) {
			if(set.contains(str.charAt(i))) {
				temp="";
				set.clear();
			}
			set.add(str.charAt(i));
			temp = temp+str.charAt(i);
			
			if(temp.length() > longestSubString.length())
				longestSubString = temp;
		}
		
		System.out.println(longestSubString);
		System.out.println(longestSubString.length());
		
	}

}
