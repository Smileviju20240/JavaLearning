import java.util.Scanner;

public class IntegerAndUpperLowerCase {

	private static String upper="";
	private static String lower="";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int Intnum = sc.nextInt();
		System.out.println("The number " +Intnum+ " is an Integer");
		
		System.out.println("***************************************************");
		
		findinglength();
	}
	
	@SuppressWarnings("resource")
	public static void findinglength() {
		
		Scanner sc1 = new Scanner(System.in);
		String str = sc1.nextLine();
		for(int i=0; i<str.length();i++) 
		{
			char ch = str.charAt(i);
			 if(ch>=65 && ch<=90) 
			 {
				upper=upper+ch;
			 }
			 else {
				lower=lower+ch;
			 }
		}
		System.out.println(upper);
		System.out.println(lower);
	}

}
