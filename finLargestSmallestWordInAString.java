package STRING;

public class finLargestSmallestWordInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 Write a program to find largest & smallest word in a string.
//		 i/p :
//		 String s1 = "welcome to hefshine soft pvt ltd";
//		 o/p :
//		 smallest word : to
//		 largest word : hefshine
		
		String s1 = "welcome to hefshine soft pvt ltd";
		
		String sa[] = s1.split(" ");
		for(int i=0; i<sa.length; i++)
		{
			for(int j=i+1; j<sa.length; j++)
			{
				if(sa[i].length()>sa[j].length())
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		System.out.println("smallest word : "+sa[0]);
		System.out.println("largest word : "+sa[sa.length-1]);
		
		


	}

}
