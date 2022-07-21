import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class FindingMaxMin {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
		List<String> strList = Arrays.asList("Vijay", "Ravi", "S", "Z");
		
		Optional<Integer> minvalue = list.stream()
		                                   .max((val1, val2) -> {return val1.compareTo(val2);
		    		                                            });
		System.out.println(minvalue.get());
		
	 System.out.println("*******************************************************");
	    
	    String Max = strList.stream()
	                        .max(Comparator.comparing(String::valueOf)).get();
	    System.out.println(Max);
	    
	 System.out.println("*******************************************************");
	 
	    int minNum = list.stream()
	    		           .min(Comparator.comparing(Integer::valueOf)).get();
	    System.out.println(minNum);
	    
	 System.out.println("*******************************************************");
	 
	    Optional<String> min = strList.stream()
	              .min((str1,str2) -> {return str1.compareTo(str2);
	            		              });
	    System.out.println(min.get());
	    
	    System.out.println("************Without using if-else************");
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Provide first value : ");
	    int a = scanner.nextInt();
	    System.out.println("Provide second value : ");
	    int b = scanner.nextInt();
	    
	    int maxormin = a>b?a:b;
	    System.out.println(maxormin);
	    
	}

}
