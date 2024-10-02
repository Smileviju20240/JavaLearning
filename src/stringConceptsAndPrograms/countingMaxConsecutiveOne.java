package stringConceptsAndPrograms;

public class countingMaxConsecutiveOne {

	public static void main(String[] args) {
		
		int[] arr = {1,1,0,1,1,1,1,0,1,1,1};
		int tempCount = 0;
		int maxCount = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1) {
				tempCount++;
				if(tempCount > maxCount) {
					maxCount=tempCount;
				}
			}else
				tempCount=0;
		}
		System.out.println(maxCount);
	}

}
