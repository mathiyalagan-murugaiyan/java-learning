package programming_class;

public class ReverseTwoDimensionArray {

	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=arr.length-1;i>=0;i--) {     //reverse the total array
			for(int j=arr[i].length-1;j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("*********************************************************************************************");
		
		for(int i=0;i<arr.length;i++) {           //reverse the column of array
			for(int j=arr[i].length-1;j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}


	}
}