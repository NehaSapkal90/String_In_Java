package STRING;

public class Conversion_of_STring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program how to Convert a String to an Integer
//		I/p: String s = "200";
//		O/p: 200
		String s = "200";

//		char b[]=new char[s.length()];
//		for(int i=0; i<s.length(); i++) {
//			b[i]=s.charAt(i);
//			System.out.print((char)b[i]);
//			
//		}

		int b[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			b[i] = s.charAt(i);
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print((char) b[i]);
		}

	}

}
