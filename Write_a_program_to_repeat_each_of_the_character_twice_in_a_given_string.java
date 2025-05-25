package STRING;

public class Write_a_program_to_repeat_each_of_the_character_twice_in_a_given_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to repeat each of the character twice in a given string.
//		i/p :
//		String s="abc";
//		o/p :
//		aabbcc
		
		String s="welcome";
		String s1="";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			s1=s1+ch+ch;
		}
		System.out.print(s1);

	}

}
