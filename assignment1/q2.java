import java.util.Scanner;
import java.util.Arrays;
public class Q2 {
	public static int lastOccurence(int[] arr, int key) {
		int lastocc = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				lastocc=i;
			}
		}
		return lastocc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 20 , 20, 50 , 10 , 50};
		System.out.println("Array : "+Arrays.toString(arr));
		System.out.println("Key to be searched : ");
		int key = sc.nextInt();
		int result = lastOccurence(arr, key);
		if(result==-1) {
			System.out.println("Key is not found!!");
		}else {
			System.out.println("last occurence of key is at : "+result);
		}
	}

}