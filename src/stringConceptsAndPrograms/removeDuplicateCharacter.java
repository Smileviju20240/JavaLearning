package stringConceptsAndPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		
		String str = "programming";

		StringBuilder sb1 = new StringBuilder();
		for(int i=0; i< str.length(); i++) {
			int indx = str.indexOf(str.charAt(i), i+1);
			if(indx == -1) {
				sb1.append(str.charAt(i));
			}
		}
		System.out.println(sb1);
//*****************************************************
		char[] ch = str.toCharArray();
		StringBuffer sb2 = new StringBuffer();
		
		for(int i=0; i<str.length(); i++) {
			boolean flag = false;
			for(int j=i+1; j<str.length(); j++) {
				if(ch[i] == ch[j]){
					flag = true;
				}
			}
			if(!flag)
				sb2.append(ch[i]);
		}
		System.out.println(sb2);
//*****************************************************
		
		Set<Character> set = new HashSet<>();
		StringBuffer sb3 = new StringBuffer();
		
		for(int i=0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		for(Character c: set) {
			sb3.append(c);
		}
		System.out.println(sb3);
	}

}
