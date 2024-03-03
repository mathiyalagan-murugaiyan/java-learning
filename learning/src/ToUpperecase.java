
public class ToUpperecase {
	
	public static void main(String args[]) {
		
		String s1 = "0abcd%$#" ;
		
	  toUppercase(s1);
	}
	
	public static void toUppercase(String names) {

		for(int i=0;i<names.length();i++) {
			
			char ch = names.charAt(i);
			if(ch>='a' && ch<='z') {
				
			  ch = (char) (ch-32);
				System.out.print(ch);
			}
			else {
				System.out.print(ch);
			}
		}
	}

}
