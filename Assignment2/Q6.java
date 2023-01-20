package assignment.Assignment2;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		int [] a = {1,32,45,3,64,23,7,87,18,62,67,98,123,5};
		int [] b = {7,23,67,3,98};
		int j = 0,i = 0;
		boolean flag = false;
		Arrays.sort(a);
		Arrays.sort(b);
		for(int elem:a) {
			System.out.print(elem+" ");
		}
		System.out.println();
		for(int elem:b) {
			System.out.print(elem+" ");
		}
		while(i < a.length && j < b.length) {
				if(a[i] < b[j]) {
					i++;
				}
				else if (a[i] == b[j]) {
					i++;
					j++;
				}
				else if(a[i] > b[j]) {
					flag = true;
					break;
				}
		}
		if(flag == true) {
			System.out.println("Array is not an sub set of array");
		}
		else if(j < b.length) {
			System.out.println("Array is not an sub set of array");
		}
		else {
			System.out.println("Array is an sub set of array");
		}

	}

}
