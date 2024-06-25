import java.util.Stack;

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
	
	public void revlink()
	{
		if (head == null)
		{
			return;
		}
		else
		{
			Stack<Integer> stack = new Stack<>();
	        Node trav = head;
	        while(trav!=null)
			{
				stack.push(trav.data);
				trav = trav.next;
			}
	        
	        while(!stack.isEmpty())
	        {
	        	System.out.print(stack.pop()+ " ");
	        }
	        
		}
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}
}
