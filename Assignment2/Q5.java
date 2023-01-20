package assignment.Assignment2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Array elements");
		n = sc.nextInt();
		int [] a = new int[n];
		System.out.println("Enter the Array elements");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a.length-1; i++) {
			int minpos = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[minpos] > a[j]) {
					minpos = j;
				}
			}
			int temp = a[minpos];
			a[minpos] = a[i];
			a[i] = temp;
		}
		for(int elem:a) {
			System.out.print(elem+" ");
		}

	}

}
