import java.util.Arrays;

class LinearQueue{
	int front,rear;
	int[] arr;
	int SIZE;
	
	public LinearQueue(int size) {
		SIZE = size;
		front = rear = 0;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		if(rear==0 || front==SIZE) {
			return true;
		}else
			return false;
	}
	
	public boolean isFull() {
		if(front==0 && rear==SIZE)
			return true;
		return false;
	}
	
	public void enqueue(int value) {
		if(isFull())
			{System.out.println("Queue is full!!");
			return;}
		arr[rear++] = value;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!");
			return -1;
		}
		System.out.println(arr[front]);
		return arr[front++];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!");
			return -1;
		}
		return arr[front];
	}
	
	public void display() {
		System.out.println("Queue : "+Arrays.toString(arr));
	}
}

public class Q4 {
	
	public static void main(String[] args) {
		LinearQueue q = new LinearQueue(4);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		q.display();
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}
	
}