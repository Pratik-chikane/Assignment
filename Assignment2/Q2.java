package assignment.Assignment2;

public class Q2 {
	static void quickSort(int a[], int si, int ei){
		if(si >= ei) {
			return;
		}
		int pi = partition(a, si, ei);
		quickSort(a, si, pi-1);
		quickSort(a, pi+1, ei);
	}
	static int partition(int a[], int si, int ei) {
		int pivot = a[ei];
		int i = si-1;
		for(int j = si; j < ei; j++) {
			if(a[j] <= pivot) {
				i++;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
			
		}
		i++;
		int temp = pivot;
		a[ei] = a[i];
		a[i] =temp;
		return i;
	}
	static void print(int a[] ){
		for(int elem: a) {
			System.out.print(elem + " ");
		}
	}
	public static void main(String[] args) {
		int a[] = {21,34,45,546,7,78,56};
		quickSort(a, 0, a.length-1);
		print(a);
		
	}

}
