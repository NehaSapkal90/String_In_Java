package STRING;

public class StringArraySortByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to sort in ascending and descending order by length of the given array of strings.
//		i/p :
//		String s1 = "welcome to hef";
//		o/p :
//		to hef welcome 
		String s1 = "welcome to hef";
		String[] sa = s1.split(" ");

		for (int i = 0; i < sa.length; i++) {
			for (int j = i + 1; j < sa.length; j++) {
				if (sa[i].length() > sa[j].length()) {
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
				}
			}
		}
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]+" ");
		}
	}

}
