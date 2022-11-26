/*
*   Foundations of Computer Science
*   2018, Semester 01
*   Practical-Exam-04
*
*   student (id): a1866893
*   student (name): Wanxia Yang
*
*
* Note: your are required to perform small changes, as accessors and mutators;
*
*/
public abstract class Person{
	protected String name;
	protected int age;
	//field

	Person(){
		this.name = "unnamed";
		this.age = 0;
	}
	//constructor
	
	public String getName(){
		return name;
	}
	//getter of name
	
	public void setName(String name){
		this.name=name;
	}
	//setter of name
	
	public void setAge(int age){
		this.age=age;
	}
	//setter of age
	
	public int getAge(){
		return age;
	}
	//getter of age
}
