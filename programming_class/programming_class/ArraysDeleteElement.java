package programming_class;

import java.util.Arrays;

public class ArraysDeleteElement {
	
	public static int indexOf(int arr[], int ele) {
		int pos = -1;

		for (int i = 0; i <= arr.length; i++) {

			if (arr[i] == ele) {
				pos = i;
				break;
			}
		}
		return pos;
	}
	

	public static void main(String[] args) {
    
		
int [] arr = {1,2,5,1,6,7,1,8,5};
		
		System.out.println(Arrays.toString(arr));
		
		int ele= 1;
		
		for(int i=0;i<arr.length;i++) {
			
			int pos = indexOf(arr,ele);
			if(pos>0) {
				for
				(int j = pos; j<arr.length;j++) {
					
					arr[j] =arr[j+1];
					
				}
				arr[arr.length -1]=0;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	

}
