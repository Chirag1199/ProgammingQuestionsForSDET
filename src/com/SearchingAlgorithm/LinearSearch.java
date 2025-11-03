package SearchAlgorithm;

/*
 * Linear search is a simple searching algorithm that checks each element in a list 
 * or array one by one from start to end until it finds the target value or reaches the end.
 * 
 * */

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 18, 12, 9, 14, 77, 50, 86, 99, 77, 90, 91, 77, 1, 5, 8 };
		
		System.out.println(linearSearch(arr, 77));

	}
	
	static int linearSearch(int[] arr, int target) {
		
		if (arr.length == 0) {
			return  -1;
		}
		
		else {
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] == target) {
					return index;
			
				}
			}
		}
		
		return -1;
		
	
		
	}

}
