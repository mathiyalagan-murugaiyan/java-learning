package learning.arrays;

import java.util.Arrays;

public class ArraysDeclaration {

	public static void main(String[] args) {
		System.out.println("*******************************************");
		//char array is only print the value in after java 11
		char []name = new char[5];
		name[0]='m';
		name[1]='a';
		name[2]='t';
		name[3]='h';
		name[4]='i';
		System.out.println(name);
		
		System.out.println("*******************************************");
		
		String name2[]=new String[3];
		
		name2[0]="mathi";
		name2[1]="dinesh";
		name2[2]="jayaram";
		//String array will print the fully qulified name@address
        System.out.println(name2);
        //String array you will print using inbuild method of Arrays.deeptoSting()
        System.out.println(Arrays.deepToString(name2));
        
        System.out.println("*******************************************");
        
        int name3[]=new int[4];
        name3[0]=1;
        name3[1]=2;
        name3[2]=3;
        name3[3]=4;
      //the integer array will print the memory address in hashcode of hexadecimal value
        System.out.println(name3);
        
      //String array you will print using inbuild method of Arrays.toSting()
        System.out.println(Arrays.toString(name3));
        
        System.out.println("*******************************************");
        
        boolean[] name4=new boolean[4];
        name4[0]=true;        name4[1]=false;
        name4[2]=true;        name4[3]=false;
        
      //the integer array will print the memory address in hashcode of hexadecimal value
        System.out.println(name4);
      //String array you will print using inbuild method of Arrays.toSting() 
        System.out.println(Arrays.toString(name4));
         
        System.out.println("*******************************************");
	}
	

}
