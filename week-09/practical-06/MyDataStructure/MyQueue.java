/**
*this class defines a queque class named as MyQueue
*@author Wanxia Yang
*/

public class MyQueue {

	/**
	*this class contains two pointer, one refering to the front node and the other to the end
	*/
	private Node front;
	private Node rear;
	
	/**
	*constructor of MyQueue
	*initialize front and rear as null
	*/
	public MyQueue() {
		front=null;
		rear=null;
	}

	/**
	*this method add a new node to the end of the queue
	*@param the new node
	*/
	public void enqueue(Node node) {
		if(front==null) {
			front=node;
			while(node.getNext()!=null) {
				node=node.getNext();
			}
			rear=node;
		}else {
			rear.setNext(node);
			while(rear.getNext()!=null) {
				rear=rear.getNext();
			}
		}
	}

	/**
	*this method pop a node out of the queue at the front
	*@return the string part of the popped node
	*/	
	public String dequeue() {
		if(front==null) {
			System.out.println("Queue is Empty!");
			return null;
		}else {
			String s= front.getData();
			front=front.getNext();
			return s;
		}
	}
	
	/**
	*this method is to check whether the queue is empty
	*@return true while empty,otherwise return false
	*/
	public boolean isEmpty() {
		return front==null?true:false;
	}
	
	/**
	*this method is to print the whole queue
	*/
	public void displayQueue() {
		if(front==null) {
			System.out.println("Queue is Empty!");
		}else {
			front.printNode();
		}
	}
}
