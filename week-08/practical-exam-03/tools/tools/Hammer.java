//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:03
//===================================

public class Hammer extends HandTool{
	public void useTool(int time){
		System.out.println("Bang!");
		while(time>0){
			value=value-0.01f;
			time--;
		}
		value=value<0?0:value;
	}
	//method of using hammer
	
	public Hammer(){
	}
	//default constructor
	
	public Hammer(float weight, float value){
		super(weight, value, false);
	}
	//constructor with three parameters
}
