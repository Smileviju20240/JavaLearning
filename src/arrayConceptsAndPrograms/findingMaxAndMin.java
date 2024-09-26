package arrayConceptsAndPrograms;

public class findingMaxAndMin {

	public static void main(String[] args) {
		
		int[] arr = {12,122,31,3,124,322,544};
		int max = arr[0];
		int min = arr[arr.length-1];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= max) {
				max = arr[i];
			}else if(arr[i] <= min) {
				min = arr[i];
			}
		}
		
		System.out.println(max +" -> "+ min);
		
		/*
		Arrays.sort(arr);
		System.out.println(arr[0]+" -> "+arr[arr.length-1]);
		*/
	}

}
