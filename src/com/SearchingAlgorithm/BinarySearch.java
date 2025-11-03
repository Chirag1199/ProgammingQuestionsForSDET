package SearchAlgorithm;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 15, 23, 42, 56, 77, 91 };
		int target = 77;

		int result = binarySearch(arr, target);
		if (result != -1) {
			System.out.println(result);
		} else {
			System.out.println("Element not found. ");
		}

	}

	static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		for (int index = 0; index < arr.length; index++) {

			if (start == end) {
				return arr[index] == target ? start : -1;
			}

			else if (start > end) {
				return -1;
			}

			else {

				int midElement = (start + end) / 2;

				if (arr[midElement] == target) {
					return midElement;
				}

				else if (arr[midElement] < target) {
					// move right.
					start = midElement + 1;
				} else {
					// move left.
					end = midElement - 1;
				}

			}

		}

		return -1; // Not found after all iterations.
	}
}
