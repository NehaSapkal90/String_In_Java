package STRING;

public class convert_String_to_an_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to convert String to an integer.
//		i/p :String s="123";
//		o/p:  123
//		-------------
//		i/p :String s="13d4f45";
//		o/p :not only number
		String s = "13d4f45";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				count++;

			}
		}
		if (count == s.length()) {
			System.out.println("only number");
		} else {
			System.out.println("not only number");
		}

	}

}
