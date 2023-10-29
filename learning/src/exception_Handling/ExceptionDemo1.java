package exception_Handling;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number");
	int no1 = in.nextInt();
	
	System.out.println("Enter the number");
	int no2 = in.nextInt();
	
	ExceptionDemo1 dd = new ExceptionDemo1();
	
	dd.divide(no1,no2);
	
	dd.subtract(no1,no2);

	}

	
	private void divide(int no1, int no2) {
		
		try {
		System.out.println(no1/no2);
		
		int[] ar = new int[no1];
		System.out.println(ar.length);
		}
		catch(ArithmeticException  e) {
			System.out.println("check the number");
		}
		catch(NegativeArraySizeException e) {
			Scanner in = new Scanner(System.in);
			
			System.out.println("Array is not stored in negative numbers");
			System.out.println("please emter valid numbers");
			System.out.println("Enter the number");
			 no1 = in.nextInt();
			System.out.println("Enter the number");
			 no2 = in.nextInt();
			
		   divide(no1,no2);
		  
		}
		catch(Exception e) {
			System.out.println("problem");
		}
		
	}
	
	private void subtract(int i, int j) {

		System.out.println(i);
		System.out.println(j);
	     System.out.println(i-j);
			
		}


}
