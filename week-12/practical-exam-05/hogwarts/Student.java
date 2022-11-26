/*==================================
Foundations of Computer Science
Student: Wanxia Yang
id: a1866893
Semester:s1
Year:2022
Practical Exam Number:05
===================================*/

public class Student{
	protected String name;
	protected int age;
	protected int period;
	//field

	public void setName(String name){
		this.name=name;
	}
	//setter of name

	public String getName(){
		return name;
	}
	//getter of name
		
	public void setAge(int age){
		this.age=age;
	}
	//setter of age;
	
	public int getAge(){
		return age;
	}
	//getter of age;
	
	public void setPeriod(int period){
		this.period=period;
	}
	//setter of period
	
	public int getPeriod(){
		return period;
	}
	//getter of period

	public Student(){
		name="unknown";
		age=0;
		period=0;
	}
	//basic constructor

	public Student(String name, int age, int period){
		this.name=name;
		this.age=age;
		this.period=period;
	}
	//special constructor

	public void printStudent(){
		System.out.println("Printing student record");
		System.out.printf("Name:\t%s\nAge:\t%d\nPeriod:\t%d\n", name, age, period);
	}
	//print method to show all the information	
}
