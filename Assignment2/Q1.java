package assignment.Assignment2;

import java.util.Scanner;

public class Q1 {
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
		System.out.println("Dublicate elements");
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
