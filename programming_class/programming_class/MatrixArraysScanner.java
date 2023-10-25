package programming_class;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixArraysScanner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the rows");
		int row = in.nextInt();
		System.out.println("Enter the column");
		int column = in.nextInt();
		int arr[][]= new int [row][column];
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println("Enter the value");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=in.nextInt();
				
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
