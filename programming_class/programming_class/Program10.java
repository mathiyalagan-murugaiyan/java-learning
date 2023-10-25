
package programming_class;
class Program10{

	public static void main(String args[]){

		int a,b;

		a = 10;
        b = 5;

        System.out.println("before swap");
         System.out.println(a);
         System.out.println(b);

         //swap the two numbers without using third variable

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("after swap");
         System.out.println(a);
         System.out.println(b);
 
	}
}