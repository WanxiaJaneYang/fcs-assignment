//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:022
// Practical Exam Number:03
//===================================

public abstract class PowerTool extends Tool{
	private int power;
	//attribute

	public int getPower(){
		return power;
	}
	//getter of power
	
	public void useTool(int time){
		System.out.print("Power Tool");
	}
	//method of use tool
	
	public PowerTool(){
	}
	//default constructor
	
	public PowerTool(float weight, float value, int powerRating){
		super(weight, value);
		power=powerRating;
	}
	//constructor with three parameters
}
