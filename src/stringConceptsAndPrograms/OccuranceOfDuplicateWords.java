package stringConceptsAndPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceOfDuplicateWords {

	public static void main(String[] args) {
		
		String input = "Bread butter and Bread";
		String[] stringArray = input.split(" ");
		Map<String, Integer> hasmap = new HashMap<String, Integer>();
		
		for(String string : stringArray) {
			int count=1;
			if(!hasmap.containsKey(string)) {
				hasmap.put(string, count);
			}else {
				hasmap.put(string, hasmap.get(string)+1);
			}
		}
		
		Set<Entry<String, Integer>> entries = hasmap.entrySet();
		for(Entry<String, Integer> entry : entries) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" -> "+entry.getValue());
			}
		}
		
	}

}
