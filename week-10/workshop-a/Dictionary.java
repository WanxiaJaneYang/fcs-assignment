public class Dictionary {
	Node root;
	
	public Dictionary() {
		Node[] children=new Node[26];
		char firstChar='a';
		int i=0;
		for(Node child:children) {
			child=new Node(firstChar);
			children[i]=child;
			i++;
			firstChar++;
		}
		root=new Node(' ', children);
	}
	//constructor of dictionary
	//create 26 children node for the root
	
	public void insert(String word) {
		Node temp=root;		
		for(int i=0; i<word.length();i++) {
			char character=word.charAt(i);
			if(foundChar(character, temp)!=null) {
				temp=foundChar(character,temp);				
			}else {
				temp.addChildren(new Node(character));				
				temp=foundChar(character,temp);				
			}
		}
	}
	//to insert a word into the dictionary
	
	public Node foundChar(char character, Node temp) {
		Node isFound=null;
		if(temp.children!=null) {
			for(Node child:temp.children) {
				if (child.character==character) {
					isFound=child;
					break;
				}		
			}
		}
		return isFound;
	}
	//method to return the found node in a node list
	
	public void printDict() {
		Node temp=root;
		temp.printNode();
	}
	//method to print the dictionary
}

