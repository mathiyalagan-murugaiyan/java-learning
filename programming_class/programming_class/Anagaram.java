package programming_class;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) {
		
		String s1 = "madam";
		String s2= "madam";
		
		boolean res= false;
		
		if(s1.length()==s2.length()) {
			
			char []ch1=s1.toCharArray();
			char []ch2=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2)) {
				
				res=true;
			}
			else {
				res= false;
			}
			
			if(res) {
				System.out.println("Anagaram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}

	}

}
