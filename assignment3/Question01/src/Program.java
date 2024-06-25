
public class Program {

	public static void main(String[] args) {
		List l = new List();
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		l.addFirst(5);
		l.addLast(52);
		l.addLast(60);
		l.addLast(70);
		l.deleteFirst();
		l.deleteLast();
		l.display();
	}

}
