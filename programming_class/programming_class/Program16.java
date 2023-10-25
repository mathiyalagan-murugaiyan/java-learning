
package programming_class;
//find the sum of digits
import java.util.Scanner;

class Program16{

	public static void main(String args[]){

		int sum=0,rem;

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		while (num >0){

			rem = num%10;

			sum += rem;

			num = num/10;

		}

		System.out.println("the sum of " + sum);
	}
}