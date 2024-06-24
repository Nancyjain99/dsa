import java.util.Scanner;
public class Q3 {
	public static int linearSearch(int[] arr, int key) {
		int N = arr.length;
		int comps=0;

		for(int i=0; i<N; i++) {
			comps++;
			if(arr[i]==key) {
				break;
			}
		}

		return comps;
	}

	public static int binarySearch(int[] arr, int key) {
		int N= arr.length;
		int comps =0;
		int left=0, right=N-1;
		while(left<=right) {
			comps++;
			int mid = (left+right)/2;
			if(arr[mid]==key) {
				break;
			}else if(key<arr[mid]) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return comps;
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
		int key = 80;
		int comps1 = linearSearch(arr, key);
		System.out.println("Number of comparisons for linear search : "+ comps1);

		int comps2 = binarySearch(arr, key);
		System.out.println("Number of comparisons for binary search : "+ comps2);
	}
}