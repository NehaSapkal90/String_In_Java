package STRING;

public class compareAGivenStringToTheSpecifiedcharacterSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to compare a given string to the specifiedcharacter sequence.
//		i/p :
//		String s1="abcd";
//		String s2="bacd";
//		o/p :
//		false
//		false
		String s1="abcd";
		String s2="bacd";
		int cnt=0;
		if(s1.length()==s2.length()) {
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)==s2.charAt(i)) {
				cnt++;
			}
		}
		if(cnt==s1.length()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		}
		
		

	}

}
