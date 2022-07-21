package starPattern;

public class rightAngleTrianglePattern {

	public static void main(String[] args) {

//		int k = 1;
//		int a = 1;
//		int b = 1;

		for (int i = 0; i < 4; i++) {
			int k = 1;
			for (int j = 0; j <= i; j++) {

				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}

		System.out.println("********************************************");
		
		for (int l = 4; l > 0; l--) {
			int a = 1;
			for (int m = 0; m < l; m++) {
				System.out.print(a);
				System.out.print("\t");
				a++;
			}
			System.out.println("");
		}	

	}

}