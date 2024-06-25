public class Program {

	public static void main(String[] args) {
		List l = new List();
		l.addFirst(50);
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		l.addSorted(35);
		l.addSorted(45);
		l.addSorted(55);
		l.addSorted(52);
		l.display();
	}
}
