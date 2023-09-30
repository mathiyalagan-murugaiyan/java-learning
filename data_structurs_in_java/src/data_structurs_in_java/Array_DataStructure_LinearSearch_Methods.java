package data_structurs_in_java;

public class Array_DataStructure_LinearSearch_Methods {

	public static int findElement(int[] num, int target) {
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]==target) {
				return i;
			}
		}
		return -1;	
	}
	
	public static boolean contains(int[] num, int target) {
		 
		for(int i=0;i<num.length;i++) {
			if(num[i]==target) {
				return true;
			}	
		}
		return false;
	}

	public static int findElement(String name, char element) {
		
		for(int i=0;i<name.length();i++) {
			
			if(name.charAt(i)==element) {
				return i;
				
			}	
		}
		return -1;
	}

	public static boolean contains(String name, char element) {
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==element) {
				return true;
			}
		}
		return false;
	}

	public static int[] findElement(int[][] num, int element) {
	
		for(int row=0;row<num.length;row++) {
			for(int col=0;col<num[row].length;col++) {
				
				if(num[row][col]==element) {
					
					return  new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
		
	}
	

}
