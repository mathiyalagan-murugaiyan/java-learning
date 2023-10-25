package programming_class;
class Palindrom{

	public static void main(String args[]){

		int r ,sum=0,temp;
		int n= 432;

		temp =n;

		while (n>0){
         
         r=n%10;

         sum = (sum*10) + r;

         n = n/10;
		}
		 if (temp == sum){

         	System.out.println("palindrom number");

         }
         else 

         	System.out.println("not palindrom number");

	}
}