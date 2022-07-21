
public class ReverseNumberProgram {

	public static void main(String[] args) {

		int number = 1234;
		int rev = 0;

		while (number != 0) {

			int n = number % 10;
			rev = rev * 10 + n;
			number = number / 10;
		}
		System.out.println(rev);
	}

}
