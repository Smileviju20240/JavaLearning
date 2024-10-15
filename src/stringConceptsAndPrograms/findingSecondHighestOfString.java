package stringConceptsAndPrograms;

import java.util.Arrays;

public class FindingSecondHighestOfString {
	static String temp;

	public static void main(String[] args) {

		String str = "Vijay Govindrao Vyas";
		String[] stringArray = str.split(" ");

		for (int i = 0; i < stringArray.length; i++) {
			for (int j = i+1; j < stringArray.length; j++) {
				if (stringArray[i].length() > stringArray[j].length()) {
					temp = stringArray[i];
					stringArray[i] = stringArray[j];
					stringArray[j] = temp;

				}
			}
		}
		System.out.println(stringArray[1]);

		/*
		 * int[] arr = {12,23,17,24,10,15,20}; 
		 * Arrays.sort(arr);
		 * System.out.println(arr[arr.length-2]);
		 */
	}

}