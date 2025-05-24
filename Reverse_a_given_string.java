package STRING;

public class Reverse_a_given_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to reverse a string.
//		Input: "hello"
//		Output: "olleh"
		
		String s="Hello";
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
