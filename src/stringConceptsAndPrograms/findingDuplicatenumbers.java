package stringConceptsAndPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class findingDuplicatenumbers {

	public static void main(String[] args) {

		Integer[] arr = { 12, 122, 31, 12, 124, 322, 544, 122 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
				if (!map.containsKey(arr[i])) {
					map.put(arr[i], count);
				} else if (map.containsKey(arr[i])) {
					count = map.get(arr[i]);
					map.put(arr[i], ++count);
				}
		}

		Set<Entry<Integer, Integer>> entry = map.entrySet();
		for(Entry<Integer, Integer> eachEntry : entry) {
			if(eachEntry.getValue() > 1) {
				System.out.println(eachEntry.getKey());
			}
		}
		/*
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println("Duplicate numbers is : "+arr[i]);
			}
		}
		*/
	}

}
