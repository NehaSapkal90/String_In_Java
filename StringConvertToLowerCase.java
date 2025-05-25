package STRING;

public class StringConvertToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to convert all the characters in a string tolowercase.
//		i/p :
//		String s1 = "WELCOME";
//		o/p :
//		welcome

		String s1 = "WELCOME";
		String s2 = "";

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			// If character is uppercase, convert to lowercase
			if (c >= 'A' && c <= 'Z') {
				c = (char) (c + 32);
			}
			s2 = s2 + c; // Append character to result
		}

		System.out.println(s2);

	}

}
