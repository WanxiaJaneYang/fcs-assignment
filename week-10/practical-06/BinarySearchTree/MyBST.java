/**
 * 
 * @author Wanxia Yang
 * this class defines a binary search tree
 */

public class MyBST {
	/**
	 * field
	 */
	private Node root;
	
	/**
	 * constructor without parameter
	 */
	public MyBST() {
		root=null;
	}
	
	/**
	 * this method insert an integer into the tree
	 * @param value:the value of the inserted integer
	 */
	public void insert(int value) {	
		if(root==null) {
			root=new Node(value);
		}else {
			Node temp=root;
			insertRec(temp, value);
		}
	}
	
	/**
	 * this method uses a recursive way to insert the integer into the tree
	 * @param temp: the current tree node
	 * @param value: the inserted integer
	 */	
	private void insertRec(Node temp, int value) {
		if(value<temp.getData()) {
			if(temp.getLeft()==null) {
				temp.setLeft(new Node(value));
			}else {
				temp=temp.getLeft();
				insertRec(temp, value);
			}
		}else if(value>temp.getData()){
			if(temp.getRight()==null) {
				temp.setRight(new Node(value));
			}else {
				temp=temp.getRight();
				insertRec(temp, value);
			}
		}else {
			System.out.println("Node is in the tree!");
		}
	}
	
	/**
	 * this method search a integer in the tree
	 * @param value: the integer to be searched
	 * @return whether the integer is found
	 */
	public boolean search(int value) {
		Node temp=root;
		return searchRec(temp, value);
	}

	/**
	 * this method uses a recursive way to search a value in a binary tree
	 * @param tree:current node of searched tree
	 * @param value: integer to be searched
	 * @return: whether the integer is found
	 */
	private boolean searchRec(Node tree, int value) {
		if(tree==null) {
			return false; 
		}else if(tree.getData()==value) {
			return true;
		}else if(tree.getData()<value) {
			return searchRec(tree.getRight(), value);
		}else {
			return searchRec(tree.getLeft(),value);
		}
	}
	
	/**
	 * this method print the binary tree
	 */
	public void printTree() {
		if(root==null) {
			System.out.println("Empty tree");
		}else {
			System.out.print("<");
			root.printNode();
			System.out.println(">");
		}
	}

	/**
	 * this method print the result of search
	 */
	public void printSearch(int value) {
		System.out.println("Is "+value+" in the tree?");
		String result=search(value)?"Yes":"No";
		System.out.println(result);
	}
}
