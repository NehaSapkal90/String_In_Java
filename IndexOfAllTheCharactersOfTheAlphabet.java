package STRING;

public class IndexOfAllTheCharactersOfTheAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to get the index of all the characters of thealphabet.
//		i/p :
//			String s1 ="abcd";
//			o/p :
//			0 a
//			1 b
//			2 c
//			3 d
		String s1 ="abcd";
		for(int i=0; i<s1.length(); i++) {
			System.out.println(i+ " "+s1.charAt(i));
		}


	}

}
