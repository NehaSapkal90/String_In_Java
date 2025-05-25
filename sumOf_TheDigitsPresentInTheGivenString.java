package STRING;

public class sumOf_TheDigitsPresentInTheGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to return the sum of the digits present in the given string.If there is no digits the 
//				sum return is 0.
//
//				i/p :
//				String s1="a2ba1ca3d";
//				o/p :
//				6
		String s1="a2ba1ca3d";
		int sum=0;
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
			{
				int num=s1.charAt(i)-48;
				sum=sum+num;
			}
		}
		System.out.print(sum);

	}

}
