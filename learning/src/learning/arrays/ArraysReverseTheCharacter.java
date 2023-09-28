package learning.arrays;

public class ArraysReverseTheCharacter {

	public static void main(String[] args) {
		char name[]= new char[5];
		
		name[0]='m';
		name[1]='a';
		name[2]='t';
		name[3]='h';
		name[4]='i';
		
		//create object for same class
		ArraysReverseTheCharacter al = new ArraysReverseTheCharacter();
                      //passing the argument of array 
		al.reverseArray(name);//method calling
	}
    
	
	//method
	private void reverseArray(char[] name) {
		
		for(int i=name.length-1;i>=0;i--) {
			
			System.out.print(name[i]);
		}
		
	}

}
