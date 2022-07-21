import java.util.Scanner;

public class AddingTwoNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide first value : ");
		double a = sc.nextDouble();
		System.out.println("Provide Second value : ");
		double b = sc.nextDouble();
		
		System.out.println(a+b);
	}

}
