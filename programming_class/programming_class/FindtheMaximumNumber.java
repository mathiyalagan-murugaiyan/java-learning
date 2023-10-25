package programming_class;

public class FindtheMaximumNumber {

	public static void main(String[] args) {

		int arr [] = {2,5,7,9,4,3,5,8};
		 int fmax=0;
		 int smax=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>fmax) {
				smax=fmax;
				fmax=arr[i];
			}
			else if (arr[i]>smax) {
				smax=arr[i];
			}
			
		}
		System.out.println("First Max" +fmax);
		System.out.println("Seacond Max" +smax);
			
	}
}
		  
			


