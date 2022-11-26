/**
 * this class is to test the MyBST class and Node class
 * @author Wanxia Yang
 */

import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		MyBST tree=new MyBST();
		//create an instance of MyBST

		int[] array= {6,3,2,7,0,-48,9,23,5};
		for(int integer:array) {
			tree.insert(integer);
		}
		tree.printTree();
		//insert integers into the tree and print it

		ArrayList<Integer> list=new ArrayList<>();
		list.add(0);
		list.add(42);
		list.forEach(tree::printSearch);
		//search each element of the list in the tree
	}
}
