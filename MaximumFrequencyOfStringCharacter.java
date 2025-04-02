package STRING;

public class MaximumFrequencyOfStringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to get largestfrequency of a character in a string.
//		if all character frequency same then print first ele that occurs first
//		i/p :
//		String s1 = "abcaabcb";
//		o/p :
//		3
//		a
		String s1 = "abcaabcb";
		
		int max=0;
		char ch=0;
		for(int i=0; i<s1.length(); i++)
		{
			int cnt=0;
			for(int j=0; j<i; j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				int count=0;
				for(int j=0; j<s1.length(); j++)
				{
					if(s1.charAt(i)==s1.charAt(j))
					{
						count++;
					}
				}
				if(count>max)
				{
					max=count;
					ch=s1.charAt(i);
				}
			}
		}
		System.out.println(max+ "\n"
+s1.charAt(0));
		
	}

}
