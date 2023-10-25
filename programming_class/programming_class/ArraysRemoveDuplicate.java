package programming_class;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysRemoveDuplicate {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 1, 5, 7, 1, 8, 8, 4, 3, 6 };

		IntStream stream = Arrays.stream(arr).distinct().filter(e -> e % 2 != 0);
		stream.forEach(System.out::println);

		removeDuplicates(arr);
	}

	

	private static void removeDuplicates(int[] arr) {

		int[] result = new int[arr.length];

		int pos = 0;

		for (int ele : arr) {

			int flag = 0;

			for (int j = 0; j < pos; j++) {
				if (ele == result[j]) {

					flag = 1;
					break;
				}
			}
			if (flag == 0) {

				result[pos] = ele;
				pos++;
			}

		}
		System.out.println(Arrays.toString(result));

	}

	private static void removeDuplicates1(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {

				 for(int j=i+1;j<arr.length;j++) {
					 if(arr[i] == arr[j]) {
						 
						 for(int k=j;k<arr.length-1;k++) {
							 arr[k]=arr[k+1];
						 }
						 arr[arr.length-1]=0;
						 
					 }
					 
				 }
			}
		}
        System.out.println(Arrays.toString(arr));
	}

}
