package data_structurs_in_java;

public class ArrayBinarySearch_Method {

	public static int find(int[] arr, int target) {

		int start = 0;

		int end = arr.length - 1;

		boolean asc = arr[start] < arr[end];

		while (start <= end) {
			int mid = (start + end) / 2;

			if (asc) {
				if (target > arr[mid])
					start = mid + 1;

				else if (target < arr[mid])
					end = mid - 1;
				else
					return mid;
			} else {
				if (target > arr[mid])
					end = end - 1;

				else if (target < arr[mid])
					start = start + 1;
				else
					return mid;
			}
		}
		return -1;
	}
}