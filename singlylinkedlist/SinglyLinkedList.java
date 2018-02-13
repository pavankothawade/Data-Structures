package ds.linkedlist;

public class SinglyLinkedList {
	
	//private ListNode head;	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data= data;
			this.next=null;
		}
	}
	
	// Insert node at the beginning of singly linked list
	public ListNode insertAtBegining(ListNode head, int data) {
		ListNode newNode= new ListNode(data);
		if(head==null){
			return newNode; 
		}
		newNode.next=head;
		head=newNode;
		return head;
	}
	
	// Insert node at the end of singly linked list
	public ListNode insertAtEnd(ListNode head, int data) {
		ListNode newNode= new ListNode(data);
		if(head==null) {
			return newNode;
		}
		ListNode current;
		current=head;
		while(current.next!=null) {
			current=current.next;
			}
		current.next=newNode;
		return head;
	}
	
	// Insert node after given node in singly linked list
	public void insertAfter(ListNode previous, int data) {
		if(previous==null) {
			System.out.println("Previous node cant be null");
		}
		ListNode newNode= new ListNode(data);
		newNode.next=previous.next;
		previous.next=newNode;
	}

	//Given a ListNode, print all elements it holds
	public void displayList(ListNode head)
	{
		ListNode current;
		current=head;
		while(current!=null) {
			System.out.print(current.data + " --> ");
			current=current.next;
		}
		System.out.println(current);
	}
	
	//Given a ListNode head, find the length of list
	public static int listLength(ListNode head) {
		if(head==null) {
			return 0;
		}
		int count=0;
		ListNode current;
		current=head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	// Insert node at given position in singly linked list
	public static ListNode insertAtPosition(ListNode head, int data, int position) {
		int size= listLength(head);
		if(position > size-1 || position < 1) {
			System.out.println("Invalid Position");
		}  
		ListNode newNode= new ListNode(data);
		if(position == 1) {
			newNode.next = head;
			return newNode;
		}else {
			ListNode previous= head;
			int count =1;
			while(count < position-1) {
				previous = previous.next;
				count++;
				}
			ListNode current= previous.next;
			newNode.next= current;
			previous.next= newNode;
		    return head;
		}
	}
	
	// Delete first node in singly linked list
	public static ListNode deleteFirst(ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode temp= head;
		head= head.next;
		temp.next=null;
		return temp;
	}
	
	// Delete last node in singly linked list
	public static ListNode deleteLast(ListNode head) {
		ListNode last= head;
		ListNode previousToLast= null;
		while(last.next!=null) {
			previousToLast = last;
			last = last.next;
			}
		previousToLast.next = null;
		return last;
	}
	
	//Delete node at given position on singly linked list
	public static ListNode deleteAtPosition(ListNode head, int position) {
		ListNode previous = head;
		int count=1;
		while(count < position-1) {
			previous = previous.next;
			count++;
		}
		ListNode current= previous.next;
		previous.next = current.next;
		current.next = null;
		return current;
		
	}
	
	//Search given node data in singly linked list
	public static boolean searchElement(ListNode head, int searchKey) {
		ListNode current = head;
		while(current != null) {
			if(current.data == searchKey) {
				return true;

			}
			current = current.next;
		}
		return false;
	}
	//To find middle node in singly linked list
	
	public static ListNode findMiddle(ListNode head) {
		if(head == null) {
			return null;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
	
	//remove duplicates from singly linked list
	
	public static void removeDuplicate(ListNode head) {
		 if(head == null) {
			return; 
		 }
		 ListNode current = head;
		 while(current != null && current.next !=null) {
			 if(current.data == current.next.data) {
				 current.next = current.next.next;
			 }else {
				 current = current.next;
			 }
		 }
	}
	public static void main(String[] args) {
		
		ListNode head= new ListNode(10);
		ListNode second= new ListNode(20);
		ListNode third= new ListNode(30);
		ListNode fourth= new ListNode(40);
		
		head.next= second;
		second.next=third;
		third.next=fourth;
		
		SinglyLinkedList sl= new SinglyLinkedList();
		
		sl.displayList(head);
		System.out.println();
		ListNode deleted= sl.deleteAtPosition(head,  3);
		System.out.println(deleted.data);
		}

}
