import java.util.Arrays;

class CircularQueue{
	int front, rear, counter = 0;
	int size;
	int[] arr;
	public CircularQueue(int size){
		this.size = size;
		arr = new int[size];
		front = rear = -1;
	}
	
	public boolean isEmpty() {
		if(counter==0) {
			System.out.println("Queue is empty!!");
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(counter==size) {
			System.out.println("Queue is full!!");
			return true;
		}
		return false;
	}
	
	public void enqueue(int value) {
		if(isFull()) {
			return;			
		}
		arr[(++rear)%size] = value;
		counter++;
	}
	
	public int dequeue() {
		if(isEmpty())
			return -1;
		counter--;
		return arr[(++front)%size];
	}
	
	public int peek() {
		if(isEmpty())
			return -1;
		return arr[(front+1)%size];
	}
	
	public void display() {
		System.out.println("Queue : "+ Arrays.toString(arr));
	}
}

public class Q8 {
	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(4);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		queue.display();
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
	
}