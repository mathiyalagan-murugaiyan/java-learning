package programming_class;

public class FindMinimumNumber {

	public static void main(String[] args) {
		int arr [] = {2,5,7,9,4,3,5,8};
		 int fmin=Integer.MAX_VALUE;
		 int smin=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<=fmin) {
				smin=fmin;
				fmin=arr[i];
			}
			else if (arr[i]<=smin) {
				smin=arr[i];
			}
			
		}
		System.out.println("First Max" +fmin);
		System.out.println("Seacond Max" +smin);
			
	}

	}


