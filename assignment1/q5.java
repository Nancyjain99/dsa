public class Q5 {
	public static void binarySearch(int[] arr, int value) {
		int left = 0, right= arr.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid] == value) {
				System.out.println("Index : "+mid);
				return;
			}

			if(value>arr[mid]) {
				right=mid-1;
			}
			else {
				left = mid+1;
			}
		}
		System.out.println("Element npt found!!");
	}

	public static void main(String[] args) {
		int[] arr = {50, 40, 30, 20, 10};
		binarySearch(arr, 60);
	}
}