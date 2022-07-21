package arrayConcept;

import java.util.ArrayList;

public class findingDuplicateNumber {

	public static void main(String[] args) {

		int[] list_Number = { 2, 2, 5, 8, 8, 9, 12, 12, 20 };

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < list_Number.length; i++) {

			for (int j = i + 1; j < list_Number.length; j++) {

				if (!al.contains(list_Number[j])) {

					if (list_Number[i] != list_Number[j]) {
						al.add(list_Number[i]);
						break;
					}

				}
			}
		}
		for (int p : al)
			System.out.println(p);
	}

}
