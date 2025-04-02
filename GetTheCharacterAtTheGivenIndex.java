package STRING;

public class GetTheCharacterAtTheGivenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to get the character at the given index within theString.
//		i/p :
//		String s1 ="abcd";
//		int index=3;
//		o/p :
//		d
//		---------------------
//		i/p :
//		String s1 ="abcd";
//		int index=5;
//		o/p :
//		out of range index
		String s1 = "abcd";
		int index = 3;
		int count = 0;
		char[] c = s1.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (i == index) {
				System.out.println(c[index]);
				count++;
			}
		}
		if(count==0) {
			System.out.println("out of the range");
		}
			
		

	}
}
