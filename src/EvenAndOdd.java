import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenAndOdd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide number : ");
		int a = sc.nextInt();

		/*
		 * if(a%2==0) 
		 *    { 
		 *      System.out.println("Even number"); 
		 *     }else
		 *      System.out.println("Odd Number");
		 */

		System.out.println("short*******************************************************Trick");
		
		String[] trick = { "even", "odd" };
		System.out.println(a + " is " + trick[a & 1]);

		System.out.println("Advancedforloop*******************************************************with conditional statement");

		//int[] listInt = { 2, 5, 10, 12, 16, 21, 35, 40, 45, 77, 101, 202 };
		  int listInt[] = { 2, 5, 10, 12, 16, 21, 35, 40, 45, 77, 101, 202 };
		for (int s : listInt) {
			if (s % 2 == 0)
				System.out.println(s);
		}
		
		System.out.println("Stream*******************************************************Concept");

		List<Integer> list = Arrays.asList(10, 2, 3, 4, 50, 6, 7, 80, 9, 102);
		List<Integer> evenNum = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers are: "+evenNum);


		List<Integer> oddNum = list.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd Numbers are: "+oddNum);

	}

}
