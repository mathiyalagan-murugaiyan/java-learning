import java.util.Scanner;

public class Hello1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the age");
		int age = in.nextInt();
			
	}
	
	public static void check(int age) {
		
		if(age>=18) {
			System.out.println("your eligible");
		
		}
		else {
			System.out.println("your not eligible");
		}
		
	}

}
