public class Q6 {
	public static int findNthOccurence(int[] arr, int num, int occ) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num)
				count++;
			if(count==occ)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,1,1,1,1,2,2,3,3,4,5,6,2,3,3};
		System.out.println(findNthOccurence(arr, 2,10));
	}
}
