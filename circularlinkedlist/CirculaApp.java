package circularlinkedlist;

public class CirculaApp {

	public static void main(String[] args) {
		CircularLinkedList cl= new CircularLinkedList();
		cl.insertFirst(100);
		cl.insertFirst(300);
		cl.insertLast(250);
		cl.deleteFirst();
		cl.displayList();

	}

}
