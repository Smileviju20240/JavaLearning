package stringConceptsAndPrograms;

import java.util.Arrays;

public class LongestPrefixInStringOfArray {
	
	public void fetchingLongestPrefix(String[] strgs) {
		
		String str1 = strgs[0];
		String str2 = strgs[strgs.length-1];
		int index=0;
		
		while(index < str1.length()) {
			if(str1.charAt(index) == str2.charAt(index))
				index++;
			else
				break;
		}
		System.out.println(str1.substring(0,index));
		
	}

	public static void main(String[] args) {
		
		String[] strs = { "Vijay", "Vijaynath", "Vijayshil", "Vijire" };
		LongestPrefixInStringOfArray fetch = new LongestPrefixInStringOfArray();
		Arrays.sort(strs);
		fetch.fetchingLongestPrefix(strs);
	}

}
