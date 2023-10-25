
package programming_class;
class Program6 {
    
   static int power(int base,int exponent){

   	int power = 1;

   	for(int i=1;i<=exponent;i++){
     
     power = power*base;

   	}
   	return power;

   }

	public static void main(String args[]){
    
    int base,exponent;
     
    int pow = power(11,3);

    System.out.println("the power of number" +pow);
	}
}