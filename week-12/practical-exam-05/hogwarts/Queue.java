/*==================================
Foundations of Computer Science
Student: Wanxia Yang
id: a1866893
Semester:s1
Year:y1
Practical Exam Number:05
===================================*/

public class Queue{
	public Node front;
	public Node back;
	//field
	
	public Queue(){
	}
	//basic constructor

	public void enqueue(Student tmpStudent){
		if(front==null){
			front=new Node(tmpStudent);
			back=front;
		}else{
			back.setNext(new Node(tmpStudent));
			back=back.getNext();
		}		
	}
	//method to enqueue 
	
	public Student dequeue(){
		if(front==null){
			return null;
		}
		
		Student dequeue=front.getInfo();
		front=front.getNext();
		return dequeue;
	}
	//method to dequeque
	
	public String peek(){
		if(front==null){
			return "";
		}
		
		return front.getInfo().getName();
	}
	//method to peek at the name of the first student

	public void displayQueue(){
		if(front==null){
			System.out.println("There are no students waiting for a scholarship");
			return;
		}
		
		Node temp=front;
		int count=1;
		while(temp!=null){
			String rank="";
			switch(temp.getInfo().getPeriod()){
				case 1:
					rank="st";
					break;
				case 2:
					rank="nd";
					break;
				case 3:
					rank="rd";
					break;
				default:
					rank="th";
					break;
			}
			System.out.printf("#%d %s, %d years old, %d%s year in Hogwarts;\n",count, temp.getInfo().getName(), temp.getInfo().getAge(), temp.getInfo().getPeriod(), rank);
			temp=temp.getNext();
			count++;
		}
	}
	//method to print the queue
}
