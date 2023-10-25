package programming_class;

public class ArrayfindlastSecondMax {

	public static void main(String[] args) {
		
		int arr[]= {12,15,8,7,19,20,29};
		int max=0;
		int element=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			int temp=arr[i];
			while(temp>1) {
				count++;
				temp=temp/10;
	
			}
			if(count>1) {
				if(arr[i]%10 >max) {
					max=arr[i]%10;
					element=arr[i];
				}
			}
			
		}
		System.out.println(element);

		
		System.out.println("*******************************************************");
		
		
		int arr1[]= {12,15,8,7,19,20,29};
		 max=0;
	     element=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			int temp=arr[i];
//			while(temp>1) {
//				count++;
//				temp=temp/10;
//	
//			}
			if(arr[i]>10) {
				if(arr[i]%10 >=max) {
					max=arr[i]%10;
					element=arr[i];
				}
			}
			
		}
		System.out.println(element);

	}

}


