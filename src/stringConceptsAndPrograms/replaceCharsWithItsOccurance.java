package stringConceptsAndPrograms;

public class replaceCharsWithItsOccurance {

	public static void main(String[] args) {

		int cnt=1;
		String str = "opentext";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 't' || str.charAt(i) == 'e') {
				str = str.replaceFirst(String.valueOf('t'), String.valueOf(cnt));
				str = str.replaceFirst(String.valueOf('e'), String.valueOf(cnt));
				cnt++;
			}
		}
		System.out.println(str);
	}

}
