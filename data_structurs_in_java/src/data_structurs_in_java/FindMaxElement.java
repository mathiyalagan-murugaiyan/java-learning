package data_structurs_in_java;

public class FindMaxElement {

	public static void main(String[] args) {

		int[] arr = { 10, 8, 5, 2, 1 };

		findMax(arr);

	}

	private static void findMax(int[] arr) {

		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {

				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				

			}
			
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]+ " ");

		}

	}
}
