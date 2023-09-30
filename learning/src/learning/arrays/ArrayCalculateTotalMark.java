package learning.arrays;

import java.util.Scanner;

public class ArrayCalculateTotalMark {

	public static void main(String[] args) {
		
		
		findTotal();//method calling
	}

	
	
	private static void findTotal() {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the subjects");
		int subjects = in.nextInt();
	 	int[]mark = new int[subjects];
		int total = 0,i;
		
		System.out.println("Enter the marks");
		
		for( i=0;i<mark.length;i++) {
			
			mark[i]=in.nextInt();
			
			total = total+ mark[i];
			
		
		}
		
		System.out.println(total);
		System.out.println(total/subjects);
		
	}

}
