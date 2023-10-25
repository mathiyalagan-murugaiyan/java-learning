
package programming_class;
import java.util.Scanner;

class Program13{

   //sum the even number
	public static void main(String args[]){

	int i =1, sum=0;

	 Scanner in = new Scanner(System.in);

	 System.out.println("Enter the number");

	 int n = in.nextInt();

	 while(i <= n){

	 	if (i%2 == 0){
          
          sum += i;
          
           System.out.println(i);

	 	}
	 	
	 	i++;

	 }
	 System.out.println(sum);

}
}