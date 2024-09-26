package stringConceptsAndPrograms;

public class LongestPrefixInStringOfArray {
	
	public void fetchingLongestPrefix(String[] strgs) {
		
		for(int i=0; i<strgs[0].length(); i++) {
			for(int j=1; j<strgs.length; j++) {
				if(strgs[j].length() <= i || strgs[0].charAt(i) != strgs[j].charAt(i)) {
					System.out.print(strgs[0].substring(0,i));
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		String[] strs = { "Vijay", "Vijaynath", "Vijayshil", "Vijire" };
		LongestPrefixInStringOfArray fetch = new LongestPrefixInStringOfArray();
		fetch.fetchingLongestPrefix(strs);
	}

}
