import java.util.Arrays;

public class Q9 {
	public static int selectionSort(int[] arr) {
		int comps=0;
		int N=arr.length;
		for(int i=0; i<N-1; i++) {
			for(int j= i+1; j<N; j++) {
				comps++;
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return comps;
	}
	public static void main(String[] args) {
		int[] arr = {1, 4, 2 , 5 , 7, 3, 5};
		System.out.println("Array before sorting : "+Arrays.toString(arr));
		int comps = selectionSort(arr);
		System.out.println("Array after sorting : "+Arrays.toString(arr));
		System.out.println("Number of comparisons : "+ comps);
	}
}