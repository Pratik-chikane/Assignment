package assignment.Assignement4;

public class Q2 {
	public static void main(String[] args) {
		String str = "Great responsibility";
		str = str.toLowerCase();
		System.out.println("Original  String: " + str);
		int[] freq = new int[26];
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch - 97]++;
		}
		for (int i = 0; i < 26; i++) {
			if (freq[i] > 1) {
				char ch = (char) (i + 97);
				temp = temp + ch;
			}
		}
		System.out.println("Duplicate Character:" + temp);
	}

}