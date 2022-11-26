/**
*This class defines node
*@author Wanxia Yang
*/

public class Node {

	/**
	*field
	*/
	private String data;
	private Node next;
	
	/**
	*@return the data of the node
	*/
	public String getData() {
		return data;
	}
	
	/**
	*@return the next node
	*/
	public Node getNext() {
		return next;
	}
	
	/**
	*@param the data of the node to be set
	*/
	public void setData(String data) {
		this.data=data;
	}

	/**
	*@param the next node pointer of the node to be set
	*/
	public void setNext(Node next) {
		this.next=next;
	}
	
	/**
	*this method print the list node
	*/
	public void printNode() {
		System.out.print("Data saved in this Node is "+data);
		Node temp =next;
		if(temp!=null) {
			while(temp.getNext()!=null) {
				System.out.print("->"+temp.getData());
				temp=temp.getNext();
			}
			if(temp.getNext()==null) {
			System.out.print("->"+temp.getData());
			}
			
		}
		System.out.println("");
	}
	
	/**
	*default constructor of node
	*/
	public Node() {	
	}
	
	/**
	*this constructor create a node
	*@param string data of the node
	*/
	public Node(String data) {
		this.data=data;
	}
}
