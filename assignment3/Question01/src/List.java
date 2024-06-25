public class List{
	static class Node{
		private int data;
		private Node next;
		public Node(int value)
		{
			data=value;
			next=null;
		}
	}
	private Node head;
	private Node tail;
	int count;
	public List()
	{
		tail=null;
		count=0;
	}

///////////////////////////////////////////////////////////////
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(tail== null) {
			tail = newnode;
			newnode.next = tail;
		}
		else {
			newnode.next = tail.next;
			tail.next = newnode;
		}
		count++;
	}
	
///////////////////////////////////////////////////////////////	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(tail== null) {
			tail = newnode;
			newnode.next = tail;
		}
		else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail=newnode;
		}
		count++;
	}
	
///////////////////////////////////////////////////////////////
	
	public void deleteFirst() {
		if(tail== null) {
			return;
		}
		else if(tail==tail.next)
		{
			tail=tail.next=null;
		}
		else {
			tail.next = tail.next.next;
		}
		count--;
	}
///////////////////////////////////////////////////////////////
	
	public void deleteLast() {
		if(tail== null) {
			return;
		}
		else if(tail==tail.next)
		{
			tail=tail.next=null;
		}
		else {
			Node trav = tail.next;
			while(trav.next.next!=tail.next) {
				trav = trav.next;
			}
			trav.next = tail.next;
			tail = trav;
		}
		count--;
	}
///////////////////////////////////////////////////////////////
	public void display()
	{
		if(tail == null)
		{
			return;
		}
		Node trav = tail.next;
		System.out.print("List : "); 
		do
		{
			System.out.print(" "+trav.data);
			trav=trav.next;
			
		}while(trav!=tail.next);
		System.out.println();
		System.out.println("Total count : "+ count);
	}
	
	
	
}