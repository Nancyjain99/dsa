import java.util.Arrays;

public class Q7 {
	public static void reverse(int[] arr) {
		Stack st = new Stack(arr.length);
		for(int i=0; i<arr.length; i++)
			st.push(arr[i]);
		for(int i=0; i<arr.length; i++)
			arr[i] = st.pop();
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println("Original array : "+ Arrays.toString(arr));
		reverse(arr);
		System.out.println("Reversed array : "+Arrays.toString(arr));
	}
}