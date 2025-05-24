package STRING;

public class reverseEveryWordInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to reverse every word in a string using methods.
//		i/p :
//		String s1 = "I am a good boy";
//		o/p :
//		I ma a doog yob
		
		String s1 = "I am a good boy";	
		
		String s2[] = s1.split(" ");
		for(int i=0; i<s2.length; i++)
		{
			String temp=s2[i];
			char ca[]=temp.toCharArray();
			int start=0;
			int end=ca.length-1;
			while(start<end)
			{
				char ch=ca[start];
				ca[start]=ca[end];
				ca[end]=ch;
				start++;
				end--;
			}
			String s3=new String(ca);
			s2[i]=s3;
		}
		String s4="";
		for(int i=0; i<s2.length; i++)
		{
			s4=s4+s2[i]+" ";
		}
		System.out.println(s4);
		
		


	}

}
