import java.util.Scanner;

public class GreatestThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int a = in.nextInt();
		System.out.println("enter the number");
		int b = in.nextInt();
		System.out.println("enter the number");
		int c = in.nextInt();
		
		findGreatestNumber( a ,b,c);

	}

	private static void findGreatestNumber(int a , int b,int c) {
		// TODO Auto-generated method stub
		
		if(a > b  && a>c) {
			System.out.println(a +" is greater");
			
		}
		else if(b>a  && b>c) {
			System.out.println(b +" is greater");
		}
		
		else {
			System.out.println(c +" is greater");
		}
		
	}

}
