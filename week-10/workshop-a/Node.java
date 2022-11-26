public class Node {
	char character;
	Node[] children;
	
	public Node() {
	}
	//constructor without parameters
	
	public Node(char c) {
		character=c;
	}
	//constructor with one parameter
	
	public Node(char c, Node[] children) {
		character=c;
		this.children=children;
	}
	//constructor with two parameters
	
	public void addChildren(Node node) {
		if(children!=null) {
			Node[] newChildren= new Node[children.length+1];
			int index=0;
			for(Node child: children) {
				if(child.character<node.character) {
					index++;
				}else {
					break;
				}				
			}
			for(int i=0; i<newChildren.length;i++) {
				if(i<index) {
					newChildren[i]=children[i];					
				}else if(i==index) {
					newChildren[i]=node;
				}else {
					newChildren[i]=children[i-1];
				}
			}
			children=newChildren;
		}else {
			children=new Node[1];
			children[0]=node;
		}
	}
	//insert the child node into the children
	
	public void printNode() {
		if(character!=' ') {
			System.out.print(character+", ");
		}
		if(children!=null) {
			for(Node child:children) {
				child.printNode();
			}
		}
	}
	//method to print the node

}

