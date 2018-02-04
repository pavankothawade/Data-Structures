package ds.stack;

public class Stack {
public int maxSize;
public char stackarray[];
public int top;
 public Stack(int size) {
	 this.maxSize= size;
	 this.stackarray= new char[maxSize]; 
	 this.top=-1;
	 
 }
 public void push(char j) {
	 if(isFull()) {
		 System.out.println("Stack is full");
	 }else {
	 top++;
	 stackarray[top]=j;
	 }
 }
 public char pop() {
	 if(isEmpty()) {
		 System.out.println("Stack is empty");
		 return 0;
	 }else {
	 int oldtop= top;
	 top--;
	 return stackarray[oldtop];
	 }
	 
	
	
 }
 public char peak() {
	 return stackarray[top];
 }
 public boolean isEmpty() {
	 return (top==-1);
 }
 public boolean isFull() {
	 return (maxSize-1==top);
 }
 public String reversestring(String str) 
 {
 	int size= str.length();
 	Stack thestack1= new Stack(size);
 	for(int i=0;i<size; i++) 
 	{
 		char ch= str.charAt(i);
 		thestack1.push(ch);
 	}
 	String resultstring="";
 	while(!thestack1.isEmpty())
 	{
 		
 		char c= thestack1.pop();
 		resultstring= resultstring+ c;
 		
 	}
 	return resultstring;
 }
}
