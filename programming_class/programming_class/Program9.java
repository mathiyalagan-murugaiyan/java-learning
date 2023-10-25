
package programming_class;
class Program9{

	public static void main(String args[]){

		int a,b,c;

		a = 10;
        b = 5;

        System.out.println("before swap");
         System.out.println(a);
         System.out.println(b);

         //swap the two numbers using third variable

        c = a;
        a = b;
        b = c;

        System.out.println("after swap");
         System.out.println(a);
         System.out.println(b);
 
	}
}