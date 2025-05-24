package STRING;

public class removeASpecifiedCharacterFrom_AString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to remove a specified character from a givenstring.
//		i/p :
//		String s="Aabcd";
//		Char ch='a';
//		o/p :Abcd
		
		String s="Aabcd";
		char ch='a';
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==ch) {
				continue;
			}else {
				System.out.print(s.charAt(i));
			}
		}

	}

}
