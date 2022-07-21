import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class findingDuplicateNumbers {

	public static void main(String[] args) {
		
		List<Integer> List = Arrays.asList(1,2,2,13,1,20,23,23,25,26,30);
		Set<Integer> dup = List.stream()
		                         .filter(e -> Collections.frequency(List, e)>1)
		                           .collect(Collectors.toSet());
		System.out.println(dup);
		
	System.out.println("****************************************");
		
		Set<Integer> dupNum = new HashSet<Integer>();
		Set<Integer> dupnumb = List.stream()
		                             .filter(n -> !dupNum.add(n))
		                               .collect(Collectors.toSet());
		System.out.println(dupnumb);
		
	System.out.println("****************************************");
		
		List<String> List1 = Arrays.asList("Vijay", "Sachin", "Vijay");
		Set<String> dupstr = List1.stream()
		                               .filter(str -> Collections.frequency(List1, str)>1)
		                                  .collect(Collectors.toSet());
		
		System.out.println(dupstr);
	}

}
