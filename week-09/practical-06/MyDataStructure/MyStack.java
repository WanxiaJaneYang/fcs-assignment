/**
*@author Wanxia Yang
*this class defines a class stack named as MyStack
*/

public class MyStack {

	/**
	*field
	*the class contains a top node pointer of the stack
	*/
	private Node top;
	
	/**
	*constructor of MyStack
	*/
	public MyStack() {
		top=null;
	}

	/**
	*this method push a node into the stack
	*the new node will become the new top node
	*@param the pushed node
	*/
	public void push(Node node) {
		if(top==null) {
			top=node;
		}else {
			Node temp=node;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(top);
			top=node;
		}
	}

	/**
	*this method pop a node out of the stack
	*the popped node is the former top node
	*the top node pointer moved after popped
	*@return the popped node(only the string data kept)
	*/	
	public Node pop() {
		if(top==null) {
			System.out.println("Stack is empty!");
			return null;
		}else {
			Node popped=new Node(top.getData());
			top=top.getNext();
			return popped;
		}
	}
	
	/**
	*this method is to see the top node of the stack
	*@return the top node if the top node is not null, return null otherwise
	*/
	public Node peek() {
		if(top==null) {
			System.out.println("Stack is empty!");
			return null;
		}else {
			return top;
		}
	}

	/**
	*this method is to see the if the stack is empty
	*@return true if the stack is empty, otherwise return false
	*
	public boolean isEmpty() {
		return top==null?true:false;
	}	
}
