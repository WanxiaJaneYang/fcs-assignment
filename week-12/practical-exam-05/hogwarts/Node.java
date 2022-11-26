/*==================================
Foundations of Computer Science
Student: Wanxia Yang
id: a186893
Semester:s1
Year:1
Practical Exam Number:05
===================================*/

public class Node{
	protected Student info;
	protected Node next;
	//field

	public Node(){
	}
	//basic constructor
	
	public Node(Student tempStudent){
		info=tempStudent;
	}
	//special constructor

	public Student getInfo(){
		return info;
	}
	//getter of info

	public void setInfo(Student tempStudent){
		info=tempStudent;
	}
	//setter of info

	public Node getNext(){
		return next;
	}
	//getter of next

	public void setNext(Node tempNode){
		next=tempNode;
	}
	//setter of next
	
}
