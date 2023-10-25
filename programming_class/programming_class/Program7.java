
package programming_class;
import java.util.Scanner;

class Program7{

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		System.out.println("please enter the value");
         
        int num = in.nextInt();

		System.out.println("enter the length");

		int length = in.nextInt();

		for(int i=1; i<=length; i++){

			System.out.println(i + "*"+num+"="+(i*num));
		}

	}
}