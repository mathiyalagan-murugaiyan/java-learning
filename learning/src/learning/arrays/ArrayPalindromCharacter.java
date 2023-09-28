package learning.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPalindromCharacter {

	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the name");
			
			String name1 =in.next();
			
			
			char[] name = name1.toCharArray();
			System.out.println(name);
			
			 palindromTheCharacter(name);
		}
	}
	
	
	private static void palindromTheCharacter(char[] name) {
		
		char [] name2 = new char[name.length];
		
		
		int i=0,j=name.length-1;
		
		while(i<name.length) {
			
			name2[i]=name[j];
			
			i++;
			j--;
			
		}
		System.out.println(Arrays.equals(name, name2)?"palindrom":"not palindrom");
		
		
//		if(Arrays.equals(name, name2))
//		{
//			System.out.println("palindrom");
//		}
//		else
//		{
//			System.out.println("Not palindrom");
//		}
		
	}

}
