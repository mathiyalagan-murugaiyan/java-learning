package programming_class;
import java.util.Scanner;
class AmstrongNumber{

    
   
	public static void main(String args[]){	
    
    int num, rem, sum=0;

    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter the value");
    num = in.nextInt();

    int temp = num;

    while(num > 0){


    	rem = num%10;

    	sum = sum + rem*rem*rem;

    	num = num/10;
    }

    if(temp == sum)

     System.out.println("Amstrong number");

    else 

     System.out.println("not Amstrong number");
	}
}