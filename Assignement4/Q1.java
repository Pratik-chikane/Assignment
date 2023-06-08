package assignment.Assignement4;

public class Q1 {
	public static void main(String[] args) {

		String str = "Great responsibility";
		System.out.println("Original String: " + str);
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (temp.indexOf(ch) < 0) {
				temp += ch;
			}
		}

		str = temp;
		System.out.println("After Removing Duplicate: " + str);

	}

}