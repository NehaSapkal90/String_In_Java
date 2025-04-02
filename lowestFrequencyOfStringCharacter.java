package STRING;

public class lowestFrequencyOfStringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to get lowest frequency of a character in a string.
//		i/p :
//		String s1 = "weLcome";
//		o/p :
//		1
//		w
		String s1 = "weLcome";
		int min=Integer.MAX_VALUE;
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
				if(count<min)
				{
					min=count;
					ch=s1.charAt(i);
				}
			}
		}
		System.out.println(min+"\n"+ch);
		
		

	}

}
