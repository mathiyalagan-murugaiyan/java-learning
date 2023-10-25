
package programming_class;
import java.util.Scanner;

class Program5{


	public static void main(String args[]){

     int a,b,ch;
     Scanner in = new Scanner(System.in);
     System.out.println("Enter two numbers");
     a = in.nextInt();
     b = in.nextInt(); 
     
     System.out.println("choose the operator");
     System.out.println("Add  1");
     System.out.println("mul  2");
     System.out.println("sub  3");
     System.out.println("div  4");

     ch = in.nextInt();
     switch(ch){

     case 1:

     	System.out.println("Addition "+ (a+b));
     	break;

     case 2:
        
        System.out.println("multification " + (a*b));
        break;

     case 3: 
     
        System.out.println("subraction "+ (a-b));
        break;

     case 4:
     
        System.out.println("division "+ (a/b));
        break;

     default :

     	System.out.println("Please choose valid operator");
     }
	}
}