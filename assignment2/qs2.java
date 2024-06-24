import java.util.Arrays;

public class Q2 {
	public static void DescendingInsertionSort(int[] arr) {
		for(int i = arr.length-2; i>=0; i--) {
			int temp = arr[i];
			int j=i+1;
			while(j<arr.length && arr[j]>temp) {
				arr[j-1]=arr[j];
				j++;
			}
			arr[j-1]=temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {3,2,1,5,4,6,7};
		DescendingInsertionSort(arr);
		System.out.println("Sorted array : "+ Arrays.toString(arr));
	}
}