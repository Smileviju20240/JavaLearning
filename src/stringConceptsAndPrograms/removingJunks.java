package stringConceptsAndPrograms;

public class removingJunks {

	public static void main(String[] args) {
		
		String str = "12#$vijay+=";
		String str1 = str.replaceAll("[^0-9a-zA_Z]", "");
		System.out.println(str1);

	}

}
