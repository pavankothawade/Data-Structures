package circularlinkedlist;

public class CircularLinkedList {
public Node first;
public Node last;

public CircularLinkedList() {
	first= null;
	last= null;
}
public boolean isEmpty() {
	return (first==null);
}
public void insertFirst(int data) {
	Node newnode= new Node();
	newnode.data= data;
	if(isEmpty()) {
		last= newnode;
	}
	newnode.next= first;
	first= newnode;
	
}
public void insertLast(int data) {
	Node newnode= new Node();
	newnode.data= data;
	if(isEmpty()) {
		first= newnode;
	}else {
		last.next= newnode;
		last= newnode;
	}
	
}
public int deleteFirst() {
	int temp= first.data;
	if(first.next==null) {
		last=null;
	}
	first= first.next;
	return temp;
}
public void displayList() {
	Node current= first;
	while(current!=null) {
		current.dispalyNode();
		current= current.next;
	}
	
}
}
