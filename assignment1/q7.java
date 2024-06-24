import java.util.Arrays;

public class Q7 {

	public static int findFirstNonRepeating(int[] arr) {
		int[] flags = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			int num = arr[i];
			flags[i] = 1;
			int count=0;
			for(int j=i+1; j<arr.length; j++) {
				if(flags[j]==1) {
					continue;
				}
				if(arr[j]==num) {
					count++;
				}
			}
			if(count==0) {
				return num;
			}
		}
		return 100;

	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,-1,2,1,0,4,-1,7,8};
		System.out.println(findFirstNonRepeating(arr));
	}
}