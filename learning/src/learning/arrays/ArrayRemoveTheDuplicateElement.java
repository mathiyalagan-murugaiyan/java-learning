package learning.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayRemoveTheDuplicateElement {

	public static void main(String[] args) {

     int[] num= {1,2,3,2,4,6,7,5,3};
     
     Set<Integer> uset = new HashSet<>();
     Set<Integer> dset = new HashSet<>();
     
     System.out.println(Arrays.toString(num));
     for(int val : num) {
    	 
    	 if(!uset.add(val)) {
    		 dset.add(val);
    	 }
     }
     System.out.println(uset);	
     System.out.println("remove duplicate" + dset);
    		 
    		 
    		 
    		 
    		 
    		 
    		 
    		 
    		 
    		 
	}

}
