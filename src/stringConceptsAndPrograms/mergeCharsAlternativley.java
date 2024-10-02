package stringConceptsAndPrograms;

public class mergeCharsAlternativley {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "pqrst";
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<(str1.length()) || i< str2.length(); i++) {
			if(i<str1.length())
				result.append(str1.charAt(i));
				
			if(i<str2.length())
				result.append(str2.charAt(i));
		}
		System.out.println(result);
	}

}
