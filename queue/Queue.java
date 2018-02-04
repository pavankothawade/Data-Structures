package ds.queue;

public class Queue {
  private int maxSize;
  private long[] queArray;
  private int front;
  private int rear;
  private int noofitems;
  
  public Queue(int size) {
	  this.maxSize=size;
	  this.queArray= new long[size];
	  this.front=0;
	  this.rear=-1;
	  this.noofitems=1;
  }
  public void insert(long j) {
	  if(isFull()) {
		  System.out.println("Queue is full");
	  }else
	  {
	  rear++;
	  queArray[rear]= j;
	  noofitems++;
  }
  }
  public long remove() {
	
	 
	  
	  long item= queArray[front];
	  front++;
	  if(front==maxSize) {
		  front=0;
	  }
	  noofitems--;
	  return item;
	  
  }
  public void view() {
	  System.out.print("[");
	  for(int i=0; i<queArray.length; i++) {
		  System.out.print(queArray[i]+" ");
	  }
	  System.out.print("]");
  }
  public boolean isEmpty() {
	  return (noofitems==0);
  }
  public boolean isFull() {
	return (noofitems==maxSize);
	  
  }
  
}
