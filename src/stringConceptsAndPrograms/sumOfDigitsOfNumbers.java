package stringConceptsAndPrograms;

public class SumOfDigitsOfNumbers {

	public static void main(String[] args) {

		int num = 6598;
		int sum = 0;
		do {
			sum = 0;
			while (num > 0) {
				sum = sum + (num % 10);
				num = num / 10;
			}
			num = sum;
		} while (sum > 9);
		System.out.println(sum);
	}
}