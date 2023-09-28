package learning.arrays;

public class ArraysFristletteranLastlettersame {

	public static void main(String[] args) {

		
		char [] name= {'m','a','t','h','i'};
		
		int i=0;
		
		while(i<name.length) {
			
			System.out.print(name[i] );
			i++;
		}
		
		
		//find fist letter and last letter as same
		findFristAndLastLetters( name); //method calling
	}
	
	 static void findFristAndLastLetters(char[] name) {
		 
			char frist=name[0];
			int len =name.length;
			char last =name[len-1];
			if(frist == last) {
				System.out.println("same");
			}
			else {
				System.out.println("not same");
			}
	}

}
