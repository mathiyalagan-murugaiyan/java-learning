package learning.arrays;

public class Arraypalindromwithoutthridvariable {

	public static void main(String[] args) {

     char name[]=new char[5];
     name[0]='m';
     name[1]='a';
     name[2]='t';
     name[3]='h';
     name[4]='i';
    // System.out.println(name);
     int i=0,j=name.length-1;
     while(i<j) {
    	 
    	 char temp = name[i];
    	 name[i] = name[j];
    	 name[j] = temp;
    	 
    	 i++;
         j--;
     }
     
    
     System.out.println(name);

	}

}
