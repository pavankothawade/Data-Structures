package ds.linkedlist;

public class App {

	public static void main(String[] args) {
		Node nodeA= new Node();
		Node nodeB= new Node();
		Node nodeC= new Node();
		Node nodeD= new Node();

		nodeA.data=1;
		nodeB.data=2;
		nodeC.data=3;
		nodeD.data=4;
		
		nodeA.next= nodeB;
		nodeB.next= nodeC;
		nodeC.next= nodeD;
		
	System.out.println(listlength(nodeB));
		
}
public static int listlength(Node node) {
	int counter=0;
	Node currentnode= node;
	while(currentnode!=null) {
		counter ++;
	  currentnode= currentnode.next;	
	}
	return counter;
}
}
