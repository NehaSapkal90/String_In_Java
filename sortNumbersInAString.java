package STRING;

public class sortNumbersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to sort numbers in a String. Display the result as aString.
//		E.g. if number in String is “43521” result is: “12345”.
//
//		i/p :
//		String s1="43521";
//		o/p :
//		12345
		
		String s1="43521";
		
	char c[]=s1.toCharArray();
	for(int i=0; i<c.length; i++) {
		for(int j=i+1; j<c.length; j++) {
			if(c[i]>c[j]) {
				char ch=c[i];
				c[i]=c[j];
				c[j]=ch;
			}
		}
	}
	String s2= new String(c);
	System.out.println(s2);
		
	
		
		

	}

}
