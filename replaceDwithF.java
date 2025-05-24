package STRING;

public class replaceDwithF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to replace all the 'd' characters with 'f'characters.
//		i/p :
//		String s="dddaa";
//		o/p :
//		fffaa

		String s1 = "dddaa";
		char ch1 = 'd';
		char ch2 = 'f';
		String s2 = "";

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch == ch1) {
				ch = ch2;

			}
			s2 = s2 + ch;
		}
		System.out.println(s2);

	}

}
