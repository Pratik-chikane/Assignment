package assignment.Assignment2;

import java.util.Scanner;

public class Q3 {
	public static void main(String [] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Array elements");
		n = sc.nextInt();
		int [] a = new int[n];
		System.out.println("Enter the Array elements");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 1; j < a.length; j++) {
				if(a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		for(int elem:a) {
			System.out.print(elem+" ");
		}
	}

}
