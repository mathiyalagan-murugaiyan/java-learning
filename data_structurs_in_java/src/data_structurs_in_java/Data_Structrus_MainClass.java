package data_structurs_in_java;

import java.util.Scanner;

public class Data_Structrus_MainClass {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// find in teger array
		
		/*
		 * System.out.println("Enter the element");
		 * 
		 * int target=in.nextInt();
		 */
		
		
		//int[] num= {1,2,3,4,5,6,7};
		
		
		
		/*
		 * System.out.println(Array_DataStructure_Methods.findElement(num,target));
		 * 
		 * System.out.println(Array_DataStructure_Methods.contains(num, target));
		 */
		
		//find String Array
		System.out.println("Enter the name");
		String name =in.next();
		
		System.out.println("Enter the character");
		
		char element =in.next().charAt(0);
		
	 System.out.println(Array_DataStructure_Methods.findElement(name, element));
	 
	 System.out.println(Array_DataStructure_Methods.contains(name, element));
	}

}
