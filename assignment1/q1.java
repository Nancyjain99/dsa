import java.util.Scanner;
public class Q1 {
	public static boolean isPalindrome(int num) {
		int n=num, result=0;
		while(n!=0) {
			int x= n%10;
			result = result*10+x;
			n/=10;
		}
		return num==result;
	}

	public static boolean isPalindrome(String str) {
		String s = str;
		int start=0;
		int end = str.length()-1;
		while(start<=end) {
			if(str.charAt(start)==str.charAt(end)) {
				start++;
				end--;
			}else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("Enter a number : ");
		 * int num = sc.nextInt();
		 * 
		 * boolean b = isPalindrome(num); if(b) {
		 * System.out.println("Entered number is palindrome"); }else {
		 * System.out.println("Entered number is not palindrome"); }
		 */

		int num = 012210;
		String str = Integer.toString(num);
		System.out.println(isPalindrome(str));
	}

}