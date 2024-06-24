import java.util.Arrays;

public class Q6 {
	public static int max(Stack st) {
		if(st.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int max=Integer.MIN_VALUE;
		while(!st.isEmpty()) {
			if(st.peek()>max) {
				max = st.peek();
			}
			st.pop();
		}
		return max;
	}
	
	public static void main(String[] args) {
		Stack st = new Stack(5);
		st.push(1);
		st.push(2);
		st.push(6);
		st.push(4);
		st.push(5);
		
		st.display();
		
		System.out.println("Max element is : "+max(st));
	}
}