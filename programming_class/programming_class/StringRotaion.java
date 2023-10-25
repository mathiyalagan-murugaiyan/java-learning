package programming_class;
import java.util.Scanner;

public class StringRotaion {

	public static void main(String[] args) {
		while (true) {
			try (Scanner in = new Scanner(System.in)) {
				System.out.println("Enter the Frist Name");
				String s1 = in.next();

				System.out.println("Enter the Second Name");
				String s2 = in.next();

				boolean res = rotate(s1, s2);

				if (res) {
					System.out.println("Rotation");
				} else {
					System.out.println("Not Rotation");
				}
			}

		}
	}

	private static boolean rotate(String s1, String s2) {
		String s3 = "";

	boolean res = false;

		if (s1.length() == s2.length()) {

			s3 = s1 + s1;
		}
		return s3.contains(s2);

	}

}
