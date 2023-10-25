
package programming_class;
import java.util.Scanner;

class Program15{

	public static void main(String args[]){

		int i =1 , n;

	   int count =0;

	   Scanner in = new Scanner(System.in); 

	   System.out.println("Enter the number ");
       
       n = in.nextInt();

	   while(i <=n){

	   	if(i%2 == 0){

	   		count++;
	   		System.out.println(i);

	   	}
	   	i++;
	   }
	   System.out.println(count);
	}
}