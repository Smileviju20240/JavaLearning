package stringConceptsAndPrograms;

public class ReplaceIntegerWithNumberOfOnes {

	public static void main(String[] args) {
		
		String str = "Abc5d9";
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < str.length(); i++) {
			//if(Character.isDigit(str.charAt(i))) {
			if(str.charAt(i) > '0' && str.charAt(i) <= '9') {
				int num = Character.getNumericValue(str.charAt(i));
				for(int j=0; j < num; j++) {
					sb.append('1');
				}
			}else
				sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}

}
