
public class Program {

	public static void main(String[] args) {
		List l = new List();
		l.addFirst(20);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		l.addAfterNode(50, 20);
		l.addAfterNode(60, 20);
//		l.addBeforeNode(70, 20);
//		l.addBeforeNode(80, 70);
		l.display();
	}
}

