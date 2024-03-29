package assignment.Assignement4;

public class Q8 {

	public static void main(String[] args) {

		String s = "abcdefghijklmnopqrs";

		System.out.println("Original String: " + s);

		int[] freq = new int[128];
		char[] chArr = s.toCharArray();

		for (int i = 0; i < chArr.length; i++) {
			freq[(int) (chArr[i])]++;
		}
		System.out.println("Characters" + "	" + "Occuring");
		System.out.println("**************************");
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				System.out.println((char) (i) + "		" + freq[i]);
			}
		}
		int maxOccur = Integer.MIN_VALUE;
		char maxOccurChar;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > maxOccur) {
				maxOccur = freq[i];
				maxOccurChar = (char) (i);
			}
		}
		System.out.println("**************************");
		System.out.println("maximum occuring character: " + maxOccurChar);
		System.out.println("Occuring " + maxOccur + " times");
	}

}