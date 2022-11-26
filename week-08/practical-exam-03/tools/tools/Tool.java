//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:03
//===================================

public abstract class Tool implements Asset{
	public float weight;
	public float value;
	//attributes
	
	public float getValue(){
		return value;
	}
	//getter of value
	
	public float getWeight(){
		return weight;
	}
	//getter of weight

	public abstract void useTool(int time);
	//method of use tool
	
	public Tool(){
	}
	//default constructor

	public Tool(float weight, float value){
		this.weight=weight;
		this.value=value;
	}
	//constructor with two parameters
}
