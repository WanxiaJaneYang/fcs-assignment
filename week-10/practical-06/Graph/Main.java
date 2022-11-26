/**
 * this class is to test the MyGraph class
 * @author Wanxia Yang
 */
public class Main {

	public static void main(String[] args) {
		int[][] matrix= {{0,1,0,1},{1,0,0,0},{0,0,0,1},{0,1,1,0}};
		MyGraph graph=new MyGraph();
		graph.matrixToList(matrix);
		graph.displayAdjListArray();
	}

}
