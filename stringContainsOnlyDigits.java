package STRING;

public class stringContainsOnlyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to test if a given string contains only digits
//		i/p :
//		String s1 ="1f23";
//		o/p
//		not contains only digit :
		String s1 ="1f23";
		int count=0;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)>='0'&&s1.charAt(i)<='9') {
				count++;
			}
		}
		if(count==s1.length()) {
			System.out.println("contain only digits");
		}else {
			System.out.println("not contain only digit");
		}
		
		

	}

}
