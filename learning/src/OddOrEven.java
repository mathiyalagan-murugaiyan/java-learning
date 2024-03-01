import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = in.nextInt();
		
		find(number);

	}

	private static void find(int number) {
		// TODO Auto-generated method stub
		
		switch(number%2) {
		
		case 0:
			
			System.out.println("Even number");
			break;
			
		case 1:
			System.out.println("odd number");
			
			
			
		
		}
		
	}

}
