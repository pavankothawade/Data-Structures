package singlylinkedlist;

public class SinglyLinkedList {
public Node first;
	public SinglyLinkedList() {
		
	}
	public boolean isEmpty() {
		if(first==null) {
			return true;
		}else {
			return false;
		}
			
			
				
	}
	public void insertfirst(int data) {
		Node newnode= new Node();
		newnode.data= data;
		newnode.next= first;
		first=newnode;
	}
	public Node deletefirst() {
		Node temp= first;
		first= first.next;
		return temp;
		
	}
	public void insertLast(int data) {
		Node current= first;
		while(current.next!=null) {
			current=current.next;
		}
		Node newnode= new Node();
		newnode.data= data;
		current.next= newnode;
		
	}
	
	public void displayList(){
	Node current= first;
	while(current!=null)
	{
		current.dispalyNode();
		current=current.next;
	}
		}
		
	}

