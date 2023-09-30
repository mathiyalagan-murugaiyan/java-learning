package data_structurs_in_java;

import java.util.Scanner;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int target=in.nextInt();
		
		
		//int[]arr= {1,2,3,4,5,6,7,8,9,10,14,22,34};
		
		int[]arr= {22,14,11,9,8,5,4,3,2,1};
		
	System.out.println(ArrayBinarySearch_Method.find(arr,target));

	}

}
