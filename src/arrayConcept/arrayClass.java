package arrayConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayClass {

	public static void main(String[] args) {

		Integer arr1[] = new Integer[3];
		arr1[0] = 20;
		arr1[1] = 30;
		arr1[2] = 40;

		List<Integer> intlist = Arrays.asList(arr1); // This list will inherit array property, so can't add
		System.out.println(intlist.size());
		
		//intlist.add(50);
		//System.out.println(intlist);
		System.out.println(intlist);
		
		System.out.println("****************************");
		
		String[] arr3 = { "Vijay", "Sachin", "Pratik" };
		
		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, arr3);
		list.add(1, "Priyanka");
		
		System.out.println(list);
		for(String name : list)
			System.out.println(name);

	}

}
