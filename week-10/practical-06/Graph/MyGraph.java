/**
 * this class is to define a graph
 * @author Wanxia Yang
 */

import java.util.LinkedList;

public class MyGraph {
	/**
	 * field
	 */
	LinkedList<Node>[] adjListArray; 
	
	/**
	 * empty constructor
	 */
	public MyGraph() {
	}

	/**
	 * this method could transfer a matrix adjacent table to a linkedList array
	 * @param matrix: the adjacent table
	 */
	@SuppressWarnings("unchecked")
	public void matrixToList(int[][] matrix) {
		adjListArray=new LinkedList[matrix.length];
		for(int i=0; i<matrix.length;i++) {
			adjListArray[i]=new LinkedList<>();
			for(int j=0; j<matrix.length;j++) {
    		   		if(matrix[i][j]==1) {
    			   		adjListArray[i].add(new Node(j));
				}
			}
		}
	}
    
	/**
	* this method is to print the adjListArray
	*/
	public void displayAdjListArray() {
		for(int i=0; i<adjListArray.length; i++) {
			System.out.printf("%d:\t", i);
			Iterator<Node> node= adjListArray[i].iterator();
			while(node.hasNext()) {
				node.next().printNode();
				if(node.hasNext()) {
					System.out.print(" -> ");
				}
			}
			System.out.println();
		}
	}
}
