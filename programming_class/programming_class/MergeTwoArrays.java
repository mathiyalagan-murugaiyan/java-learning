package programming_class;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int arr1[]= {4,2,3,1};
		int arr2[]= {5,8,7,5};
		int arr3[]= new int[arr1.length+arr2.length];
		int pos=0;
		for(int i=0;i<arr1.length;i++) {
	
			arr3[pos]=arr1[i];
			pos++;
		
		}
		for(int j=0;j<arr2.length;j++) {
			arr3[pos]=arr2[j];
			pos++;
			
		}
		System.out.println(Arrays.toString(arr3));
}
}
