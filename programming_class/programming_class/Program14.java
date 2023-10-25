
package programming_class;
import java.util.Scanner;

class Program14{

	public static void main(String args[]){

     int i=1;
     int prod =1;

     Scanner in = new Scanner(System.in);

     int n = in.nextInt();

     while(i <=n)
     {


     	if(i%2 == 0)
     	{

     		prod *= i;

     		System.out.println(i);

     	 }

     	i++;

      }

      System.out.println(prod);

	}
}