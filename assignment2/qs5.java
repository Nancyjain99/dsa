import java.util.Arrays;

class Stack{
	int top;
	int SIZE;
	int[] arr;
	public Stack(int size) {
		SIZE = size;
		top = SIZE;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		if(top==SIZE) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(top==0)
			return true;
		return false;
	}
	
	public void push(int value) {
		if(isFull())
		{
			System.out.println("Stack is full!!");
			return;
		}
		arr[--top]=value;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is full!!");
			return -1;
		}
		return arr[top++];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!!");
			return -1;
		}
		
		return arr[top];
	}
	
	public void display() {
		System.out.println("Stack : "+ Arrays.toString(arr));
	}
	
}
public class Q5 {
	
	public static void main(String[] args) {
		Stack st = new Stack(5);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		st.display();
		
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.peek();
	}
}