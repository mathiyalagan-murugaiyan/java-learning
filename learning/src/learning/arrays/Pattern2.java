package learning.arrays;

public class Pattern2 {
	
	public static void main(String args[]) {
		
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=5;j++) {
				
				if(i==2 && j==1) 
					continue;
					System.out.print(i);
					
			}
			System.out.println();
		}
	}

}
