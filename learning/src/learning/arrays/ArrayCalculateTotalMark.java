package learning.arrays;

import java.util.Scanner;

public class ArrayCalculateTotalMark {

	public static void main(String[] args) {
		
		
		findTotal();//method calling
	}

	
	
	private static void findTotal() {
		int[]mark = new int[5];
		int total = 0;
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the marks");
		
		for(int i=0;i<mark.length;i++) {
			
			mark[i]=in.nextInt();
			
			total = total+ mark[i];
			
		}
		System.out.println(total);
		
	}

}
