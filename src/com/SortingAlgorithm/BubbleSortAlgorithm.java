package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSortAlgorithm {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 5, 1, 4 };

		int[] sortedBubbleArray = bubbleSort(nums);

		System.out.println(Arrays.toString(sortedBubbleArray));

	}

	static int[] bubbleSort(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}

		return arr;
	}

}
