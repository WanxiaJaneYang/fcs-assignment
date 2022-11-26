/**
*this class test the MyQueue class and MyStack class and defines two method
*@author Wanxia Yang
*/

public class Main {

	/**
	*this method is to test the MyQueue class and MyStack class and the methods in this class
	*@param args Unused.
	*@return Nothing.
	*/
	public static void main(String[] args) {
		String[] strings=new String[4];
		strings[0]="{(a+b)+(a/d)}*{d/(a+e)}";
		strings[1]="{{))))}";
		strings[2]="{{}{}{}()()()}";
		strings[3]="()()}{";
		for(String s:strings) {
			System.out.printf("does %s match the brackets? %b\n", s, bracketsMatching(s));
		}
		//test of bracketsMatching
		
		MyQueue queue1=new MyQueue();
		queue1.enqueue(new Node("3"));
		queue1.enqueue(new Node("4"));
		queue1.enqueue(new Node("5"));
		queue1.displayQueue();
		reverseQueque(queue1).displayQueue();
		//test of reverseQueue
	}

	/**
	*this method is to check if the brackets in a given string are matched or not
	*@param the given string
	*@return true if the brackets matched, otherwise return false
	*/
	public static boolean bracketsMatching(String input) {
		MyStack brackets =new MyStack();
		//to store the left brackets
		for(int i=0; i<input.length(); i++) {
			String character=input.substring(i,i+1);
			if(character.equals("(")||character.equals("{")) {
				brackets.push(new Node(character));
				//if get the left part, push into the stack
			}else if(character.equals(")")||character.equals("}"))  {
				if (hasMatched(brackets, character)) {
						brackets.pop();
				}else {
						return false;
				}
			}
			//if get the right part, try find the match left part at the top
			//pop when found, return false when not found
		}
		return brackets.isEmpty()?true:false;
		//after received all the character, check if all the left brackets are popped
	}
	
	/**
	*this method is to check if the top node of in the stack matched the given character as brackets
	*@param stack is the given stack containing left brackets, character is a right bracket
	*@return true if the brackets matched, otherwise return false
	*/
	public static boolean hasMatched(MyStack stack, String character) {
		if(!stack.isEmpty()) {
			if(character.equals(")")){
				return stack.peek().getData().equals("(")?true:false;
			}else {
				return stack.peek().getData().equals("{")?true:false;
			}
		}else {
			return false;
		}
	}
	
	/**
	*this method is reverse a given queue
	*@param the given queue
	*@return the reversed queue 
	*/
	public static MyQueue reverseQueque(MyQueue queue) {
		MyStack store=new MyStack();
		while(!queue.isEmpty()) {
			store.push(new Node(queue.dequeue())); 
		}
		while(!store.isEmpty()) {
			queue.enqueue(store.pop());
		}
		return queue;
	}
}

