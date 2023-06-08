package assignment.Assignement4;

public class Q3 {
	public static void main(String[] args) {

		String s = "1221";

		int i = 0;
		int j = s.length() - 1;
		boolean flag = true;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				flag = false;
				break;
			}
			i++;
			j--;
		}

		if (flag == true)
			System.out.println(s + "is palindrome");
		else
			System.out.println(s + "is not palindrome");
	}

}