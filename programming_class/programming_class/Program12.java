
package programming_class;
import java.util.*;

class Program12{

	public static void main (String args[]){


		Scanner in = new Scanner(System.in);

        int i=1;

        System.out.println("Enter the number");
		int n = in.nextInt();

		while (i <= n){

           if(i%2 == 0){

           	System.out.println("The even number is " + i);
           }
           
           i++;
		}
	}
}