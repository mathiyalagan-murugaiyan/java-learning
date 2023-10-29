package data_structurs_in_java;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		int[] arr = {1,3,5,8,9};
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter The Target");
		
		int target = in.nextInt();
		
		
		int min = 0;
		
		int max = arr.length-1;
		
		while(true) {
			
			int mid = (min+max)/2;
			
			if(target == arr[ mid]) {
				System.out.println("yes present");
				break;
			}
			else if(target >arr[mid]) {
				max = mid-1;
			}
			else {
				min = mid+1;
			}
			if(min > max) {
			
				System.out.println("target not present");
				break;
			}
		}

	}

}
