package STRING;

import java.util.Iterator;

public class CreateACharacterArrayContainingTheContentsOfaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to create a character array containing the contents of astring
//		i/p :"aabbccd";
//		o/p :a a b b c c d 
		
		String s1="aabbccd";
		char c[]=new char[s1.length()];
		for(int i=0; i<s1.length(); i++) {
			c[i]=s1.charAt(i);
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+ " ");
		}
	}

}
