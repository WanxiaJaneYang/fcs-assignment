//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:03
//===================================
public abstract class HandTool extends Tool{
	private boolean sharp;
	//field

	public boolean isSharp(){
		return sharp;
	}
	//method
	
	public abstract void useTool(int time);
	//method of use tool
	
	public HandTool(){
	}
	//default constructor
	
	public HandTool(float weight, float value, boolean sharp){
		super(weight,value);
		this.sharp=sharp;
	}
	//constructor with three parameters
}
