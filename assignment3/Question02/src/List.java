
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
	public List ()
	{
		head = null;
	}
	
	public void display()
	{
		Node trav = head;
		System.out.print("List : ");
		while(trav!=null)
		{
			System.out.print(" "+ trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}
	
	public void addAfterNode(int value,int dat)
	{
		Node newNode = new Node(value);
		if(head == null)
		{
			head= newNode;
		}
		else
		{
			Node trav = head;
			while(trav.next!=null)
			{
				if(trav.data==dat)
				{
					newNode.next=trav.next;
					trav.next=newNode;
					break;
				}
				trav = trav.next;
			}
		}
	}
	
	public void addBeforeNode(int value,int dat)
	{
		Node newNode = new Node(value);
		if(head == null)
		{
			head= newNode;
		}
		else
		{
			Node trav = head;
			while(trav.next!=null)
			{
				if(trav.next.data==dat)
				{
					newNode.next=trav.next;
					trav.next=newNode;
					trav = trav.next;
					break;
				}
				trav = trav.next;
			}
		}
	}
}
