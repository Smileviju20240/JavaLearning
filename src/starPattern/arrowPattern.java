package starPattern;

public class arrowPattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
				System.out.print("\t");

			}
		System.out.println("");
		}
		
		for (int k = 3; k >= 1; k--) {
			
			for (int l = 1; l <= k; l++) {
				
				System.out.print(l);
				System.out.print("\t");
				
			}
		System.out.println("");
		}

	}

}