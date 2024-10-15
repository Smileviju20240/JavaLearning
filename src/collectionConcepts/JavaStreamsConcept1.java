package collectionConcepts;

import java.util.Arrays;
import java.util.List;

public class JavaStreamsConcept1 {

	public static void main(String[] args) {
		
		String[] str = {"Vijay", "Vijaynath", "Viji"};
		List<String> list = Arrays.asList(str);
		
		list.stream().forEach(name -> System.out.println(name));

	}

}
