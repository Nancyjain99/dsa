public class Q8 {
	public static int findRank(int arr[], int num) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<=num)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 15, 3, 4, 4, 1};
		System.out.println("Rank of 4 is : "+findRank(arr, 4));
	}
}