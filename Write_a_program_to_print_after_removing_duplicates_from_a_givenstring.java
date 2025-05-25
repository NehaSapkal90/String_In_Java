package STRING;

public class Write_a_program_to_print_after_removing_duplicates_from_a_givenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to print after removing duplicates from a givenstring.
//		i/p :
//		String s1 = "abcdabcdabcd";
//		o/p :
//		abcd
		String s1 = "abcdabcdabcd";
		int count=0;
		String s2="";
		for(int i=0; i<s1.length(); i++) {
			int cnt=0;
			for(int j=0; j<i; j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					cnt++;
				}
			}
			if(cnt==0) {
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
		
	}

}
