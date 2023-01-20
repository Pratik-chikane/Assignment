package assignment.Assignment2;
public class Q4
{
	public static void MergeSort(int arr[],int si,int ei) {
		if(si>=ei){
		    return;
	    }
	    int mid = si+(ei-si)/2;
	    MergeSort(arr,si,mid);
	    MergeSort(arr,mid+1,ei);
	    Merge(arr,si,mid,ei);
    }
	   public static void Merge(int arr[],int si,int mid,int ei){
	        int merged[]=new int [ei-si+1];
	        int idx1=si;
	        int idx2=mid+1;
	        int x=0;
	        while(idx1<= mid && idx2<=ei){
	            if(arr[idx1] <= arr[idx2]) {

	                merged [x++] = arr[idx1++];
	            }  else{
	                merged [x++] = arr[idx2++];
	            }
	        }
	        while(idx1 <= mid) {
	         merged [x++] = arr[idx1++];
	        }
	        while(idx2 <= ei) {
	            merged [x++] = arr[idx2++];
	        }
	        for(int i=0, j=si; i<merged.length; i++,j++){
	            arr[j] = merged [i];
	        }
	    }
    public static void main (String args[]){
        int arr[]={12,43,54,65,31,65,21,34};
        int n=arr.length;
        for(int elem: arr) {
        	System.out.print(elem+" ");
        }
        System.out.println();
        MergeSort(arr,0,n-1);
        for (int i=0;i<n ;i++ ){
            System.out.print(arr[i]+" ");
        }
    }
 
}
