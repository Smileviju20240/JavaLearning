package stringConceptsAndPrograms;

public class palindromeNumbers {

	public static void main(String[] args) {

		int number = 1221;
		int num = number;
		int rev = 0;

		while (num!=0) {
			rev = (rev*10) + (num%10);
			num = num/10;
		}
		
		if(rev == number) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not Palindrome");
		}
		/*
		int number1 = 1221;
		String num1 = String.valueOf(number1);
		String rev1 = "";
		for(int i=num1.length()-1; i>=0; i--) {
			rev1 = rev1 + num1.charAt(i);
		}
		
		if(rev == number) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not Palindrome");
		}
		*/
	}
	
}
