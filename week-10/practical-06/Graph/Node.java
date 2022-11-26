/**
 * this class defines Node
 * @author Wanxia Yang
 */

public class Node {
	/**
	 * field
	 */
	private int index;

	/**
	 * getter of index
	 * @return index
	 */
	public int getIndex() {
		return index;
	}
	
	/**
	 * setter of index
	 * @param index
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	
	/**
	 * constructor of node without parameter
	 */
	public Node() {
	}
	
	/**
	 * constructor of node with a parameter
	 * @param index
	 */
	public Node(int index) {
		this.index=index;
	}
	
	/**
	 * this method is to print a single node
	 */
	public void printNode() {
		System.out.print("Node "+index);
	}
}

