package programming_class;

import java.util.Arrays;

public class SplitArrayToSorting {

	public static void main(String[] args) {
		int arr[]= {4,3,2,1,5,7,10};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length/2-1;j++) {
				
				if(arr[i]>arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			for(int j=arr.length/2;j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));		
		
	}
}


