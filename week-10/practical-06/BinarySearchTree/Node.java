/**
 * @author Wanxia Yang
 * this class defines Node
 */

public class Node {
	/**
	 * field
	 */
	private int data;
	private Node left;
	private Node right;
	
	/**
	 * getter of data
	 * @return data
	 */
	public int getData() {
		return data;
	}

	/**
	 * setter of data
	 * @param data
	 */
	public void setData(int data) {
		this.data = data;
	}
	
	/**
	 * getter of left child node
	 * @return left Node
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * setter of left Node
	 * @param left
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * getter of right Node
	 * @return right 
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * setter of right child node
	 * @param right
	 */
	public void setRight(Node right) {
		this.right = right;
	}
	
	/**
	 * method to print node as trees
	 */
	public void printNode() {
		System.out.print(data);
		if(left!=null) {
			System.out.print(", ");
			left.printNode();
		}
		if(right!=null) {
			System.out.print(", ");
			right.printNode();
		}
	}
	
	/**
	 * constructor without parameter
	 */
	public Node(){	
	}
	
	/**
	 * constructor with a parameter
	 * @param data
	 */
	public Node(int data) {
		this.data=data;
	}
}
