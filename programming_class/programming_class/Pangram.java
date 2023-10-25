package programming_class;

import java.util.Arrays;

public class Pangram {

	public static void main(String[] args) {
		 
		
		String s1="The quick brown fox jumps the over the lazy dog";
		s1=s1.toLowerCase();
		
		char[] arr= new char[26];
		for(int i=0;i<=s1.length();i++) {
			char ch = s1.charAt(i);
			if(Character.isAlphabetic(ch)) {
				int index=ch-97;
				arr[index]=ch;
			}	
		}
		
		System.out.println(Arrays.toString(arr));
		boolean res =true;
		for(char ch:arr) {
			
			if(ch=='\0') {
				
				res=false;
				break;
			}
		}
		if(res) {
			System.out.println("pangram");
		}
		else {
			System.out.println("not pangram");
		}		
}
}
