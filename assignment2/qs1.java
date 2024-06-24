import java.util.Arrays;

public class Q1 {
	 public static int insertionSort(int[] arr) {
		 int comps = 0;
		 int temp;
		 for(int i=1; i<arr.length; i++) {
			 temp = arr[i];
			 int j = i-1;
			 while(j>=0 && arr[j]>temp) {
				 arr[j+1]=arr[j];
				 j--;
				 comps++;
			 }
			 comps++;
			 arr[j+1]=temp;
		 }
		 
		 return comps;
	 }
	 
	 public static void main(String[] args) {
		int[] arr = {3,2,1,5,4,6,7};
		int comps = insertionSort(arr);
		System.out.println("Sorted array : "+Arrays.toString(arr));
		System.out.println("Number of comparisons : "+ comps);
	}
}